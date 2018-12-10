package ace.java.designpatterns.behavioural.observer;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ScheduledExecutorFactoryBean;
import org.springframework.scheduling.concurrent.ScheduledExecutorTask;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 */
@SpringBootApplication
public class ObserverDemo implements CommandLineRunner {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ObserverDemo.class);
    private static final CountDownLatch cd = new CountDownLatch(10);
    @Autowired
    List<Observer> observers;

    @Autowired
    Subject subject;

    public static void main(String args[]) throws InterruptedException {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder().web(false).sources(ObserverDemo.class).run(args);
        cd.await();
        context.close();
    }

    @Bean
    public Subject subject(){
        return new ModelSubject();
    }

    @Override
    public void run(String... args) throws Exception {
        observers.forEach(observer -> subject.registerObserver(observer));

    }

    @Bean
    @Autowired
    public ScheduledExecutorFactoryBean scheduledExecutorFactoryBean(ScheduledExecutorTask scheduledExecutorTask){
        ScheduledExecutorFactoryBean scheduledExecutorFactoryBean = new ScheduledExecutorFactoryBean();
        scheduledExecutorFactoryBean.setScheduledExecutorTasks(scheduledExecutorTask);
        return scheduledExecutorFactoryBean;
    }

    @Bean
    @Autowired
    public ScheduledExecutorTask scheduledExecutorTask(Subject subject){
        ScheduledExecutorTask scheduledExecutorTask = new ScheduledExecutorTask();
        scheduledExecutorTask.setDelay(1);
        scheduledExecutorTask.setPeriod(1);
        scheduledExecutorTask.setTimeUnit(TimeUnit.SECONDS);
        scheduledExecutorTask.setFixedRate(false);
        scheduledExecutorTask.setRunnable(() -> {
            subject.notifyObservers();
            cd.countDown();
        });
        return scheduledExecutorTask;
    }

}

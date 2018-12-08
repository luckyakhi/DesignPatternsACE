package ace.java.designpatterns.creational.singleton;

import ace.java.designpatterns.creational.ace.java.design.patterns.common.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

/**
 * Proof that on getting the same singleton bean from application context we get the same instance
 * It internally uses a concurrent hashmap to store singleton beans , uses double check to implement singleton
 * The singleton is within single spring context
 */
@SpringBootApplication
public class SpringSingletonDemo implements CommandLineRunner,ApplicationContextAware {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SpringSingletonDemo.class);
    @Autowired
    Logger loggerBean;
    private ApplicationContext applicationContext;

    public static void main(String args[]){
        new SpringApplicationBuilder().web(false).sources(SpringSingletonDemo.class).run(args).close();
    }

    @Bean
    public Logger loggerBean(){
        return (message)-> {
            System.out.println("Logging:"+message);
        };
    }

    @Override
    public void run(String... args) throws Exception {
        loggerBean.log("Hello Spring singleton bean");
        Logger loggerBean2 = (Logger) applicationContext.getBean("loggerBean");
        logger.info("Both logger beans are equals {}",loggerBean2==loggerBean);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

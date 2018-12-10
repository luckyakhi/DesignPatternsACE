package ace.java.designpatterns.creational.factory;

import ace.java.designpatterns.creational.common.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "ace.java.designpatterns.creational.factory")
public class LoggerConfiguration implements CommandLineRunner {
    @Bean
    Logger console(){
        return  new ConsoleLogger();
    }

    @Bean
    Logger file(){
        return  new FileLogger();
    }

    @Autowired
    private LoggerFactory loggerFactory;

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(LoggerConfiguration.class).web(false).run().close();
    }

    @Override
    public void run(String... args) throws Exception {
        loggerFactory.createLogger("file").log("Message");
        loggerFactory.createLogger("console").log("Message");
    }
}

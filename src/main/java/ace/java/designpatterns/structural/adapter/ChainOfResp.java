package ace.java.designpatterns.structural.adapter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChainOfResp {


    @Bean
    public MessageProcessor messageProcessor(@Qualifier("JSON") MessageHandler firstHandler){
       return new DefaultProcesor();
    }
}

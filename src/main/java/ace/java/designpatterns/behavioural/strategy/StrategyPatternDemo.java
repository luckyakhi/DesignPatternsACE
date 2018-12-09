package ace.java.designpatterns.behavioural.strategy;

import ace.java.designpatterns.domain.Message;
import ace.java.designpatterns.domain.MessageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class StrategyPatternDemo implements CommandLineRunner {
    @Autowired
    private MessageProcessor messageProcessor;
    public  static void main(String args[]){
        new SpringApplicationBuilder().sources(StrategyPatternDemo.class).web(false).run(args).close();
    }

    @Override
    public void run(String... args) throws Exception {
        messageProcessor.process(new Message(MessageType.JSON,"{\"name\":\"akhi\"}"));
        messageProcessor.process(new Message(MessageType.XML,"<name>akhi</name>"));

    }
}

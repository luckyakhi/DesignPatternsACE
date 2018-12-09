package ace.java.designpatterns.behavioural.strategy;

import ace.java.designpatterns.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("XML")
public class PublishHandler implements MessageHandlerStrategy {
    private static final Logger logger = LoggerFactory.getLogger(PublishHandler.class);
    @Override
    public void handle(Message msg) {
        logger.info("Publishing message{}",msg);
    }
}

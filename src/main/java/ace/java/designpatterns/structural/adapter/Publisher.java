package ace.java.designpatterns.structural.adapter;

import ace.java.designpatterns.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

public class Publisher implements Publishers {
    private static final Logger logger = LoggerFactory.getLogger(Publisher.class);
    @Override
    public void publish(Message msg) {
        logger.info("Publishing message{}",msg);
    }
}

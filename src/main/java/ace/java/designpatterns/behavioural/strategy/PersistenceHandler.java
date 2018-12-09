package ace.java.designpatterns.behavioural.strategy;

import ace.java.designpatterns.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("JSON")
public class PersistenceHandler implements MessageHandlerStrategy {
    private static final Logger logger = LoggerFactory.getLogger(PersistenceHandler.class);
    @Override
    public void handle(Message msg) {
        logger.info("Persisting message {}",msg);
    }
}

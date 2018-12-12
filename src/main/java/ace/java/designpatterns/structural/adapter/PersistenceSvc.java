package ace.java.designpatterns.structural.adapter;

import ace.java.designpatterns.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

public class PersistenceSvc implements PersistenceS {
    private static final Logger logger = LoggerFactory.getLogger(PersistenceSvc.class);
    @Override
    public void persist(Message msg) {
        logger.info("Persisting message {}",msg);
    }
}

package ace.java.designpatterns.behavioural.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AppUIObserver implements Observer {
    private static final Logger log = LoggerFactory.getLogger(AppUIObserver.class);
    private Subject subject;

    public AppUIObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(int value) {
        log.info("Subject value changed to {}",value);
    }
}

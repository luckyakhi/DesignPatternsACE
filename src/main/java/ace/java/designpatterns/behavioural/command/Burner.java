package ace.java.designpatterns.behavioural.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Burner {
    private static  final Logger logger = LoggerFactory.getLogger(Burner.class);
    public void swithOn(){
        logger.info("Switching on the Burner");
    }

    public void swithOff(){
        logger.info("Switching off the Burner");
    }
}

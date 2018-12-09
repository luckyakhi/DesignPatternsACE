package ace.java.designpatterns.behavioural.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TV {
    private static final Logger logger = LoggerFactory.getLogger(TV.class);
    public void increaseVolume(){
        logger.info("Increasing the volume of TV");
    }

    public void decreaseVolume(){
        logger.info("Decreasing the volume of TV");
    }
}

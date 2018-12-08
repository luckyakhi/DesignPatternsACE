package ace.java.designpatterns.creational.factory;

import ace.java.designpatterns.creational.ace.java.design.patterns.common.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SpringBasedLoggerFactory implements LoggerFactory{
    private Map<String,Logger> loggerMap;

    @Autowired
    public SpringBasedLoggerFactory(Map<String, Logger> loggerMap) {
        this.loggerMap = loggerMap;
    }

    @Override
    public Logger createLogger(String loggerType) throws Exception {
        return loggerMap.get(loggerType);
    }
}

package ace.java.designpatterns.creational.factory;

import ace.java.designpatterns.creational.ace.java.design.patterns.common.Logger;

public interface LoggerFactory {
    public Logger createLogger(String loggerType) throws Exception;
}

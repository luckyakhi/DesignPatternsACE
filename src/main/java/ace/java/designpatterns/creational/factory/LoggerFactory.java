package ace.java.designpatterns.creational.factory;

import ace.java.designpatterns.creational.common.Logger;

public interface LoggerFactory {
    Logger createLogger(String loggerType) throws Exception;
}

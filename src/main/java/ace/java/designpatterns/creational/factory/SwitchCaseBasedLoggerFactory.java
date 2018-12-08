package ace.java.designpatterns.creational.factory;

import ace.java.designpatterns.creational.ace.java.design.patterns.common.Logger;

public class SwitchCaseBasedLoggerFactory implements LoggerFactory {


    public Logger createLogger(String loggerType) throws Exception {
        LoggerType loggerTypeEnum = LoggerType.valueOf(loggerType);
        switch (loggerTypeEnum){
            case CONSOLE: return  new ConsoleLogger();
            case FILE: return  new FileLogger();
            default: throw new Exception();
        }
    }
}

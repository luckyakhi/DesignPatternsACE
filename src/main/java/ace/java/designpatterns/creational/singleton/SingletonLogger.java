package ace.java.designpatterns.creational.singleton;

import ace.java.designpatterns.creational.ace.java.design.patterns.common.Logger;

public class SingletonLogger implements Logger {
    private static  SingletonLogger instance;
    private static int instanceCount;

    private SingletonLogger(){

    }

    public static SingletonLogger getInstance(){
        if(instance==null){
            instance = new SingletonLogger();
            instanceCount++;
        }
        return instance;
    }

    @Override
    public void log(String message) {
        System.out.printf("Logging message %s /n",message);
    }
    public static int getInstanceCount(){
        return  instanceCount;
    }
}

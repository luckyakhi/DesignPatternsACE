package ace.java.designpatterns.creational.singleton;

import ace.java.designpatterns.creational.ace.java.design.patterns.common.Logger;
import org.junit.Assert;
import org.junit.Test;
import sun.rmi.runtime.Log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonLoggerTest {



    @Test
    public void test_singleton_logger_mulithreaded() throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Runnable loggerTask = () -> {
            Logger logger  = SingletonLogger.getInstance();
            logger.log("Message");
        };

        threadPool.submit(loggerTask);
        threadPool.submit(loggerTask);
        threadPool.shutdown();
        threadPool.awaitTermination(1,TimeUnit.SECONDS);
        Assert.assertEquals(1,SingletonLogger.getInstanceCount());

    }
}

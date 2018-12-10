package ace.java.designpatterns.creational.singleton;

import ace.java.designpatterns.creational.common.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DoubleCheckThreadSafeLazySingletonLoggerTest {



    @Test
    public void test_singleton_logger_mulithreaded() throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Runnable loggerTask = () -> {
            Logger logger  = DoubleCheckThreadSafeLazySingletonLogger.getInstance();
            logger.log("Message");
        };

        threadPool.submit(loggerTask);
        threadPool.submit(loggerTask);
        threadPool.shutdown();
        threadPool.awaitTermination(1,TimeUnit.SECONDS);
        Assert.assertEquals(1,DoubleCheckThreadSafeLazySingletonLogger.getInstanceCount());

    }
}

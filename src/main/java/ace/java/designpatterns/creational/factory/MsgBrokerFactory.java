package ace.java.designpatterns.creational.factory;

public interface MsgBrokerFactory {
    Queue createQueue();
    Topic createTopic();
}

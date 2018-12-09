package ace.java.designpatterns.creational.factory;

public class TibocMsgBrokerFactory implements MsgBrokerFactory {
    @Override
    public Queue createQueue() {
        return new TibcoQueue();
    }

    @Override
    public Topic createTopic() {
        return new TibocTopic();
    }
}

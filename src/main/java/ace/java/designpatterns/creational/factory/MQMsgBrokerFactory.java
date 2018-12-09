package ace.java.designpatterns.creational.factory;

public class MQMsgBrokerFactory implements MsgBrokerFactory {
    @Override
    public Queue createQueue() {
        return new MQQueue();
    }

    @Override
    public Topic createTopic() {
        return new MQTopic();
    }
}

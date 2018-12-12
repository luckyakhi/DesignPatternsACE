package ace.java.designpatterns.structural.adapter;

import ace.java.designpatterns.domain.Message;

public class MessagePublisherHandler implements MessageHandler {
    private Publisher publisher;
    @Override
    public void handle(Message message) {
        publisher.publish(message);

    }

    @Override
    public MessageHandler getNext() {
        return null;
    }

    @Override
    public boolean isCandidate(Message messge) {
        return false;
    }
}

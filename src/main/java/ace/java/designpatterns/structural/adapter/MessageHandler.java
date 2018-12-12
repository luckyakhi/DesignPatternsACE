package ace.java.designpatterns.structural.adapter;

import ace.java.designpatterns.domain.Message;

public interface MessageHandler {

    void handle(Message message);
     MessageHandler getNext();
     boolean isCandidate(Message messge);
}

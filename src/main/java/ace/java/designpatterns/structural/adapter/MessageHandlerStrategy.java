package ace.java.designpatterns.structural.adapter;


import ace.java.designpatterns.domain.Message;

public interface MessageHandlerStrategy {
    void handle(Message msg);
}

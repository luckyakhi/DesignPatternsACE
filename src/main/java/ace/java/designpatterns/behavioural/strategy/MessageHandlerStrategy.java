package ace.java.designpatterns.behavioural.strategy;


import ace.java.designpatterns.domain.Message;

public interface MessageHandlerStrategy {
    void handle(Message msg);
}

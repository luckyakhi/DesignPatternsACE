package ace.java.designpatterns.behavioural.strategy;


import ace.java.designpatterns.domain.Message;

public interface MessageProcessor {
    void process(Message message);
}

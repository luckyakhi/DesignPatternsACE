package ace.java.designpatterns.structural.adapter;


import ace.java.designpatterns.domain.Message;

public interface MessageProcessor {
    void process(Message message);
}

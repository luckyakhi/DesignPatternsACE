package ace.java.designpatterns.structural.adapter;

import ace.java.designpatterns.domain.Message;

public interface Publishers {
    void publish(Message msg);
}

package ace.java.designpatterns.structural.adapter;

import ace.java.designpatterns.domain.Message;

public interface PersistenceS {
    void persist(Message msg);
}

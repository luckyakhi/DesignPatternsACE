package ace.java.designpatterns.structural.adapter;

import ace.java.designpatterns.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class DefaultProcesor implements  MessageProcessor {
    @Autowired
    private MessageHandler firstHandler;

    @Override
    public void process(Message message) {
        firstHandler.handle(message);

        //XML persist
        //JSON persit and publish
        //
    }
}

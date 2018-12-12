package ace.java.designpatterns.structural.adapter;

import ace.java.designpatterns.domain.Message;

public class JsonMessageHandler implements MessageHandler {
    private MessageHandler nextHandler;


    public void setNextHandler(MessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Message message) {
        if(isCandidate(message)){
            //logic
        }

        if(nextHandler!=null){
                nextHandler.handle(message);
        }

    }

    @Override
    public MessageHandler getNext() {
        return nextHandler;
    }

    @Override
    public boolean isCandidate(Message messge) {
        return messge.getMessageType().equals("JSON");
    }
}

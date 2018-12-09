package ace.java.designpatterns.behavioural.strategy;

import ace.java.designpatterns.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DefautlMessageProcessor implements MessageProcessor {
    @Autowired
    private Map<String,MessageHandlerStrategy> messageHandlerStrategyMap;

    @Override
    public void process(Message message) {
        messageHandlerStrategyMap.get(message.getMessageType().name()).handle(message);
    }
}

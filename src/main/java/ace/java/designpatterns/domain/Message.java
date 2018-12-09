package ace.java.designpatterns.domain;

public class Message {
    private MessageType messageType;
    private String payload;

    public Message(MessageType messageType, String payload) {
        this.messageType = messageType;
        this.payload = payload;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageType=" + messageType +
                ", payload='" + payload + '\'' +
                '}';
    }
}

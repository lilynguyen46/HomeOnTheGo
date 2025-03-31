package HomeOnTheGo.HomeOnTheGo.MessageReply;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import HomeOnTheGo.HomeOnTheGo.MessageSend.*;

@Entity
public class MessageReply extends MessageSend{
    @Column(nullable = false)
    private String receiver;

    public MessageReply() {
    }

    public MessageReply(String sender, String receiver) {
        super(sender);
        this.receiver = receiver;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}

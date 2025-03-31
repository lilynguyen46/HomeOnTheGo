package HomeOnTheGo.HomeOnTheGo.MessageSend;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import HomeOnTheGo.HomeOnTheGo.Messages.*;
@Entity
public class MessageSend extends Messages{
    @Column(nullable = false)
    private String sender;

    public MessageSend() {
    }

    public MessageSend(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }




}

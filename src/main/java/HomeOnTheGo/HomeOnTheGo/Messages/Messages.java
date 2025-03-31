package HomeOnTheGo.HomeOnTheGo.Messages;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "Messages")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int messageID;
    @Column(nullable = false)
    private String messageBody;
    private Instant time;



    public Messages() {
    }

    public Messages(int messageID, String messageBody, Instant time) {
        this.messageID = messageID;
        this.messageBody = messageBody;
        this.time = time;
    }




    public int getMessageID() {
        return this.messageID;
    }

    public String getMessageBody() {
        return this.messageBody;
    }

    public Instant getTime() {
        return this.time;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public void setTime(Instant time) {
        this.time = time;
    }








}

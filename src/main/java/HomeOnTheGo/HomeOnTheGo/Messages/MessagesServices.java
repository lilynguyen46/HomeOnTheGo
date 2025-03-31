package HomeOnTheGo.HomeOnTheGo.Messages;
import java.time.Instant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MessagesServices {

    @Autowired
    private MessagesRepo messagesRepo;

    public MessagesServices() {
    }

    public Messages writeMessage(Messages messages) {
        messages.setTime(Instant.now());
        return (Messages)this.messagesRepo.save(messages);
    }

    public List<Messages> retriveAllMessages() {
        return this.messagesRepo.findAll();
    }

    public boolean deleteMessage(int messageId) {
        if (this.messagesRepo.existsById(messageId)) {
            this.messagesRepo.deleteById(messageId);
            return true;
        } else {
            return false;
        }
    }
}

package HomeOnTheGo.HomeOnTheGo.MessageReply;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MessageReplyServices {
    @Autowired
    private MessageReplyRepo messageReplyRepo;

    public MessageReplyServices(){}


    public MessageReply saveReplyMessage(MessageReply messageReply) {
        return (MessageReply)this.messageReplyRepo.save(messageReply);
    }

    public Optional<MessageReply> getReplyMessageById(int messageID) {
        return this.messageReplyRepo.findById(messageID);
    }

    public List<MessageReply> getRepliesByReceiver(String receiver) {
        return this.messageReplyRepo.findByReceiver(receiver);
    }

    public List<MessageReply> getRepliesBySender(String sender) {
        return this.messageReplyRepo.findBySender(sender);
    }

    public void deleteReplyMessage(int messageID) {
        this.messageReplyRepo.deleteById(messageID);
    }
}

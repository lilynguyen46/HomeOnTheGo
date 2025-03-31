package HomeOnTheGo.HomeOnTheGo.MessageSend;
import java.util.List;
import java.util.*;
import java.lang.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import HomeOnTheGo.HomeOnTheGo.Messages.*;
@Service
public class MessageSendServices {


    @Autowired
    private MessageSendRepo messageSendRepo;

    public MessageSendServices() {
    }

    public MessageSend createMessageSend(MessageSend messageSend) {
        return (MessageSend)this.messageSendRepo.save(messageSend);
    }

    public List<MessageSend> getAllMessageSends() {
        return this.messageSendRepo.findAll();
    }

    public MessageSend getMessageSendById(int messageId) {
        return (MessageSend)this.messageSendRepo.findById(messageId).orElse((MessageSend) null);
    }

    public boolean deleteMessageSend(int messageId) {
        if (this.messageSendRepo.existsById(messageId)) {
            this.messageSendRepo.deleteById(messageId);
            return true;
        } else {
            return false;
        }
    }

    public List<MessageSend> getMessagesBySender(String sender) {
        return this.messageSendRepo.findBySender(sender);
    }
}

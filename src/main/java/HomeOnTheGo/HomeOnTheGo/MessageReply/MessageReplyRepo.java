package HomeOnTheGo.HomeOnTheGo.MessageReply;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageReplyRepo extends JpaRepository<MessageReply, Integer> {
    List<MessageReply> findByReceiver(String receiver);

    List<MessageReply> findBySender(String sender);
}

package HomeOnTheGo.HomeOnTheGo.MessageSend;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MessageSendRepo extends JpaRepository<MessageSend, Integer> {
    List<MessageSend> findBySender(String sender);
}

package HomeOnTheGo.HomeOnTheGo.Messages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepo extends JpaRepository<Messages, Integer> {
}

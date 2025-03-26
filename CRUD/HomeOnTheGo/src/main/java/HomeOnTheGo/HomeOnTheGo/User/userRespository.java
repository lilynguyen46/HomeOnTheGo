package HomeOnTheGo.HomeOnTheGo.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface userRespository extends JpaRespository<user, Integer> {

    List<user> getUserByID(int userID);
    List<user> getUserByName(String name);
    List<user> getUserByRole(String role);
    List<user> getUserByEmail(String email);
    List<user> getUserByUsername(String username);
    List<user> getUserByPassword(String password);
    List<user> getUserByRatings(int ratings);




}
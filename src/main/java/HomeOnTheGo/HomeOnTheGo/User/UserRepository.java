package HomeOnTheGo.HomeOnTheGo.User;

import java.util.List;

public interface UserRepository extends JpaRespository<User, Integer> {

    List<User> getUserByID(int userID);
    List<User> getUserByName(String name);
    List<User> getUserByRole(String role);
    List<User> getUserByEmail(String email);
    List<User> getUserByUsername(String username);
    List<User> getUserByPassword(String password);
    List<User> getUserByRatings(int ratings);




}
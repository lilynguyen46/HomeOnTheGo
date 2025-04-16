package HomeOnTheGo.HomeOnTheGo.Service;

import HomeOnTheGo.HomeOnTheGo.Model.User;
import HomeOnTheGo.HomeOnTheGo.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    ///  Create User
    public User createUser(User user) {
        return userRepository.save(user);
    }
    ///  get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    ///  Find User by ID
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }
    ///  Find User by Username
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    /// Find User by Email
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    ///  update User (needs more work)
    public User updateUser(User user) {
        User existing = userRepository.findById(user.getId()).orElseThrow();
        existing.setFirstName(user.getFirstName());
        existing.setEmail(user.getEmail());
        existing.setLastName(user.getLastName());
        existing.setUsername(user.getUsername());
        return userRepository.save(existing);
    }
    /// delete a user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}

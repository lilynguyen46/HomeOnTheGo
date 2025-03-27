package HomeOnTheGo.HomeOnTheGo.User;

import org.springframework.beans.factory.annotation.Autowired;


public class UserService {

    @Autowired
    private UserRepository userRespository;

    // Get all users
    public Object getAllUsers() {
        return userRespository.findAll();
    }

    //Gets users by ID number
    public Object getuserByID(int userID){
        return UserRepository.getUserByID(userID);
    }

    //Gets user by Name
    public Object getUserByName(String name){
        return UserRepository.getUserByName(name);
    }

    //Get user by role
    public Object getUserByRole(String role){
        return UserRepository.getUserByRole(role);
    }

    //Gets user by email
    public Object getUserByEmail(String email){
        return UserRepository.getUserByEmail(email);
    }

    //Gets user by username
    public Object getUserByUsername(String username){
        return UserRepository.getUserByUsername(username);
    }

    //Gets user by password
    public Object getUserByPassword(String password){
        return UserRepository.getUserByPassword(password);
    }

    //Gets user by ratings
    public Object getUserByRatings(int ratings){
        return userRepository.getUserByRatings(ratings);
    }


    //Add a new user
    public Object addNewUser(user user){
        return userRepository.save(user);
    }

    //Remove a user from the database
    public void removeUser(int userID){
        userRepository.deleteById(userID);
    }

    //Update an exsiting user in the database
    public void updateUser(int userID, user user){
        user presentUser = (user) getUserByID(userID);
        presentUser.setName(user.getName());
        presentUser.setRole(user.getRole());
        presentUser.setEmail(user.getUserByEmail());
        presentUser.setUsername(user.getUserByUsername());
        presentUser.setPassword(user.getUserByPassword());
        presentUser.setRatings(user.getUserByRatings());
        userRepository.save(presentUser);
    }


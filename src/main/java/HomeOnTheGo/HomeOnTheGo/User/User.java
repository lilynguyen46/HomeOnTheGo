package HomeOnTheGo.HomeOnTheGo.User;

import jakarta.persistence.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Entity
@Table(names= "users")

public class User {

    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private int userID;
    @Column(nullable = false)
    public String name;
    public String role;
    public String email;
    public String username;
    private String password;
    public int ratings;

    // Constructors
    public User() {}
    public User(String name, String role, String email, String username, String password, int ratings) {
        this.name = name;
        this.role = role;
        this.email = email;
        this.username = username;
        this.password = password;
        this.ratings = ratings;
    }

    // Getters

    public int getUserID() {
        return userID;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public int getRatings() {
        return ratings;
    }

    // Setters

    public void setUserID(int userID) {
        this.userID = userID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

}
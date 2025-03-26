package HomeOnTheGo;

import jakarta.persistence.*;

@Entity
@Table(names= "users")

public class users {

    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private int userID;
    @Column(nullable)
}
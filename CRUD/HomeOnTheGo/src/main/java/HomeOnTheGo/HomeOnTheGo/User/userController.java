package HomeOnTheGo.HomeOnTheGo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowire
    private userService user;

    /**
     *  METHOD: GET
     * http://localhost:8080/cats/all
     */
    @GetMapping("/all")
    public Object getAllusers(){
        return new ResponseEntity<>(service.getAllUsers(),HttpStatus.OK);
    }

    /**
     * METHOD: GET
     * IDs RANGE FROM 1-6 PICK ONE
     * ENTER AS: http://localhost:8080/cats/{catID}
     * EXAMPLE: http://localhost:8080/cats/1
     */
    @GetMapping("/{catID}")
    public Object getOneUser(@PathVariable int catID){
        return new ResponseEntity<>(service.getUserByID(UserID),HttpStatus.OK);
    }
    /**
     * METHOD: GET
     * ENTER AS: http://localhost:8080/cats/name?search={name}
     * EXAMPLE: http://localhost:8080/cats/name?search=Luna Cat
     */
    @GetMapping("/name")
    public Object getUserByName(@RequestParam(name = "search", defaultValue = "") String search){
        return new ResponseEntity<>(service.getUserByName(search), HttpStatus.OK);
    }
    }
    @GetMapping("/role")
    public Object getUserByRole(@RequestParam(name = "search", defaultValue = "") String search){
        return new ResponseEntity<>(service.getUserByRole(search), HttpStatus.OK);
    }
@GetMapping("/email")
public Object getUserByEmail(@RequestParam(name = "search", defaultValue = "") String search){
    return new ResponseEntity<>(service.getUserByEmail(search), HttpStatus.OK);
}
@GetMapping("/username")
public Object getUserByUsername(@RequestParam(name = "search", defaultValue = "") String search){
    return new ResponseEntity<>(service.getUserByUsername(search), HttpStatus.OK);
}

@GetMapping("/password")
public Object getUserBypassword(@RequestParam(name = "search", defaultValue = "") String search){
    return new ResponseEntity<>(service.getUserByPassword(search), HttpStatus.OK);
}
@GetMapping("/ratings")
public Object getUserByRatings(@RequestParam(name = "search", defaultValue = "") String search){
    return new ResponseEntity<>(service.getUserByRatings(search), HttpStatus.OK);
}









}
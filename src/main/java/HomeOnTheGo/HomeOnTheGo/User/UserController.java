package HomeOnTheGo.HomeOnTheGo.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class UserController {

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


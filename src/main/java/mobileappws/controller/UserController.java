
package mobileappws.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
 
@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser() {
        return "Get user was called";
    }

    @PostMapping
    public String createUser() {
        //TODO: process POST request
        
        return "create user was called";
    }
    
    @PutMapping
    public String putMethodName() {
        //TODO: process PUT request
        
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }
}
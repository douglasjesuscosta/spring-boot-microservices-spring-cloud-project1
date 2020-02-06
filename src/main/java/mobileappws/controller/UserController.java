
package mobileappws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import mobileappws.Dtos.UserRestDTO;
import mobileappws.model.UserRest;


@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping(path = "/{userId}",
                produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserRest> getUserById(@PathVariable String userId) {
        UserRest returnValue = new UserRest();

        returnValue.setFirstName("teste");
        returnValue.setLastName("teste2");
        returnValue.setEmail("teste@gmail.com");

        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
    }

    @GetMapping
    public String getUser(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "limit", defaultValue = "50") int limit) {    
        return "Get user was called with page " + page + "and limit: " + limit;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserRest> createUser(@RequestBody UserRestDTO userRestDTO) {
        // TODO: process POST request

        UserRest returnValue = new UserRest();

        returnValue.setFirstName(userRestDTO.getFirstName());
        returnValue.setLastName(userRestDTO.getLastName());
        returnValue.setEmail(userRestDTO.getEmail());

        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
    }

    @PutMapping
    public String putMethodName() {
        // TODO: process PUT request

        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }
}
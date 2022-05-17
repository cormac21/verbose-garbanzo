package com.cormacx.auctionservice.controller;

import com.cormacx.auctionservice.entity.user.User;
import com.cormacx.auctionservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController( UserService userService ) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createNewUser(@RequestBody UserDTO userDTO) {
        try {
            userService.createNewUser(userDTO);
        } catch( Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Failed to create new User");
        }
        return null;
    }

}

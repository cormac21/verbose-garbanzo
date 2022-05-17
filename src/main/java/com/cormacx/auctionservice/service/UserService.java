package com.cormacx.auctionservice.service;

import com.cormacx.auctionservice.controller.UserDTO;
import com.cormacx.auctionservice.entity.user.User;
import com.cormacx.auctionservice.exception.InvalidEmailException;
import com.cormacx.auctionservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService( UserRepository userRepository ) {
        this.userRepository = userRepository;
    }

    public Optional<User> findUserByEmail( String email ) {
        return userRepository.findByEmail(email);
    }

    public void createNewUser(UserDTO userDTO) {
        Optional<User> userOpt = findUserByEmail(userDTO.getEmail());
        if ( userOpt.isPresent() ) {

        }
    }
}

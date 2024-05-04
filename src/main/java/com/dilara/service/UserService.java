package com.dilara.service;

import com.dilara.entity.User;
import com.dilara.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;


public class UserService {

    private final UserRepository userRepository;
    public UserService(){
        this.userRepository = new UserRepository();
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public User findByUsernameAndPassword(String username, String password){
        Optional<User> user= userRepository.findByUsernameAndPassword(username,password);
        if (user.isEmpty()){
            throw new RuntimeException("User not found.");
        }
        return user.get();
    }

}

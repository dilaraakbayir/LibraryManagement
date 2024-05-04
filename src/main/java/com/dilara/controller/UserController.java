package com.dilara.controller;

import com.dilara.entity.User;
import com.dilara.service.UserService;
import com.dilara.ui.Utility;

public class UserController {

    private final UserService userService;
    public UserController(){
        this.userService = new UserService();
    }

    public User register(){
        String username = Utility.getStringValue("Please enter username");
        String password = Utility.getStringValue("Please enter password");
        User user = User.builder().username(username)
                .password(password).build();
        return userService.save(user);
    }

    public User login(){
        String username = Utility.getStringValue("Please enter username");
        String password = Utility.getStringValue("Please enter password");
        return userService.findByUsernameAndPassword(username,password);
    }

}

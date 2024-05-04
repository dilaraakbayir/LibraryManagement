package com.dilara;

import com.dilara.controller.UserController;
import com.dilara.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        //System.out.println(userRepository.findByUsername("mustafa"));
        System.out.println(userRepository.findByUsernameAndPassword("mustafa","123"));
        UserController userController = new UserController();
        //System.out.println(userController.register());
    }
}
package com.win.personality_quiz.controller;

import java.util.Collection;

import com.win.personality_quiz.model.User;
import com.win.personality_quiz.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "https://frontend-personality-quiz.herokuapp.com")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/names")
    public Collection<User> getUserNames() {

        return userRepo.findAll();

    }

    @GetMapping("/test")
    public String getUserNamesTest() {
        return "sup";
    }

    @PostMapping("/names")
    public void getUser(@RequestBody User user) {
        userRepo.save(user);

    }

}
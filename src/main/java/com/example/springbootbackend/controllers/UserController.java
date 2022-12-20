package com.example.springbootbackend.controllers;

import com.example.springbootbackend.models.Avion;
import com.example.springbootbackend.models.User;
import com.example.springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/login")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User loginUser(@RequestBody User u) {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            if (user.getLogin().equals(u.getLogin()) && user.getPwd().equals(u.getPwd())) {
                System.out.println("ato2");
                return user;
            }
        }
        return null;
    }
}

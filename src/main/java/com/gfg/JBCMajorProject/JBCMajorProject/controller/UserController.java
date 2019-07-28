package com.gfg.JBCMajorProject.JBCMajorProject.controller;

import com.gfg.JBCMajorProject.JBCMajorProject.model.TestRedis;
import com.gfg.JBCMajorProject.JBCMajorProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public void addUser(@RequestBody TestRedis user){
        userService.addUser(user);
    }

    @GetMapping("/users")
    public Map<Integer,TestRedis> getUsers(){
        return userService.getAllUsers();
    }
}

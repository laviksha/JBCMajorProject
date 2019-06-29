package com.gfg.JBCMajorProject.JBCMajorProject.service;

import com.gfg.JBCMajorProject.JBCMajorProject.model.User;
import com.gfg.JBCMajorProject.JBCMajorProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDao {
   @Autowired
    UserRepository userRepository;
    public List<User> findAllUsers(){
        List<User> users=userRepository.findAll();
        return users;
    }
}

package com.gfg.JBCMajorProject.JBCMajorProject.service;

import com.gfg.JBCMajorProject.JBCMajorProject.dao.UserDao;
import com.gfg.JBCMajorProject.JBCMajorProject.model.TestRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    @Autowired
    UserDao userDao;


    public void addUser(TestRedis user){
        userDao.addUser(user);
    }

    public Map<Integer,TestRedis> getAllUsers(){
        return userDao.getAllUsers();
    }
}

package com.gfg.JBCMajorProject.JBCMajorProject.dao;

import com.gfg.JBCMajorProject.JBCMajorProject.model.TestRedis;
import com.gfg.JBCMajorProject.JBCMajorProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserDao {

    @Autowired
UserRepository userRepository;


    public void addUser(TestRedis user){
        userRepository.addUser(user);
    }

    public Map<Integer,TestRedis> getAllUsers(){
        return userRepository.getAllUsers();
    }
}

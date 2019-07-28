package com.gfg.JBCMajorProject.JBCMajorProject.repository;

import com.gfg.JBCMajorProject.JBCMajorProject.model.TestRedis;
import com.gfg.JBCMajorProject.JBCMajorProject.model.TimelineStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepository  {
    ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(RedisConfig.class);
    public static final String KEY="HelloUser";

    private RedisTemplate<String, TestRedis> redisTemplate=(RedisTemplate<String, TestRedis>)ctx.getBean("redisTemplate");
    private HashOperations hashOperations=redisTemplate.opsForHash();
    /*public  UserRepository(RedisTemplate<String, TestRedis> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }*/

    /*Getting all Items from tSable*/
    public Map<Integer,TestRedis> getAllUsers(){
        return hashOperations.entries(KEY);
    }

    /*Getting a specific item by item id from table*/
    public TestRedis getUser(int itemId){
        return (TestRedis) hashOperations.get(KEY,itemId);
    }

    /*Adding an item into redis database*/
    public void addUser(TestRedis item){
        hashOperations.put(KEY,item.getId(),item);
    }

    /*delete an item from database*/
    public void deleteUser(int id){
        hashOperations.delete(KEY,id);
    }

    /*update an item from database*/
    public void updateUser(TestRedis item){
        addUser(item);
    }
}


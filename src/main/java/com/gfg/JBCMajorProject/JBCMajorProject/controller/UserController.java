package com.gfg.JBCMajorProject.JBCMajorProject.controller;

import com.gfg.JBCMajorProject.JBCMajorProject.model.User;
import com.gfg.JBCMajorProject.JBCMajorProject.service.UserDao;
import jdk.nashorn.internal.parser.JSONParser;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {
    @Autowired
   UserDao userDao;

    @GetMapping("/codeforces/{handle}")
    public String getUser(@PathVariable("handle") String handle){
        RestTemplate restTemplate=new RestTemplate();
        JSONParser jsonParser=restTemplate.getForObject(" http://codeforces.com/api/user.info?handles="+handle, JSONParser.class);
        return jsonParser.toString();

    }

}

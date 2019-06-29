package com.gfg.JBCMajorProject.JBCMajorProject.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gfg.JBCMajorProject.JBCMajorProject.model.Result;
import com.gfg.JBCMajorProject.JBCMajorProject.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@RestController
public class UserController {


    @GetMapping("/codeforces/{handle}")
    public List<Result> getUser(@PathVariable("handle") String handle){
        RestTemplate restTemplate=new RestTemplate();
        String str=restTemplate.getForObject("http://codeforces.com/api/user.info?handles="+handle, String.class);
        ObjectMapper objectMapper=new ObjectMapper();
        User user=null;

        try {
            user=objectMapper.readValue(str,User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    return user.getResult();
    }

}

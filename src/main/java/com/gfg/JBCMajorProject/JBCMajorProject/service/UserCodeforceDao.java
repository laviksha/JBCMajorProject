package com.gfg.JBCMajorProject.JBCMajorProject.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gfg.JBCMajorProject.JBCMajorProject.model.Result;
import com.gfg.JBCMajorProject.JBCMajorProject.model.UserCodeforce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Service
public class UserCodeforceDao {
    @Autowired
    UserCodeforce userCodeforce;
    public List<Result> getUser(String url){

        RestTemplate restTemplate=new RestTemplate();
        String str=restTemplate.getForObject(url, String.class);
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            userCodeforce =objectMapper.readValue(str, UserCodeforce.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userCodeforce.getResult();
    }
}

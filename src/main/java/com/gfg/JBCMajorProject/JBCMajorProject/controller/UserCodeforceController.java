package com.gfg.JBCMajorProject.JBCMajorProject.controller;

import com.gfg.JBCMajorProject.JBCMajorProject.model.Result;
import com.gfg.JBCMajorProject.JBCMajorProject.service.UserCodeforceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCodeforceController {

    @Autowired
    UserCodeforceDao userCodeforceDao;
    //consuming user.info api
    //convert json object to pojo class from http://www.jsonschema2pojo.org/
    @GetMapping("/codeforces/{handle}")
    public List<Result> getUser(@PathVariable("handle") String handle){
        String url="http://codeforces.com/api/user.info?handles="+handle;
        return userCodeforceDao.getUser(url);
    }

}

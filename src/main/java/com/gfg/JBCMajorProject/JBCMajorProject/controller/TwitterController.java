package com.gfg.JBCMajorProject.JBCMajorProject.controller;

import com.gfg.JBCMajorProject.JBCMajorProject.model.Authentication;
import com.gfg.JBCMajorProject.JBCMajorProject.model.TestRedis;
import com.gfg.JBCMajorProject.JBCMajorProject.model.TimelineStatus;
import com.gfg.JBCMajorProject.JBCMajorProject.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TwitterController {

    @Autowired
    TwitterService twitterService;

    @GetMapping("/timeline")
    public Map<String,String> getTimeline(){
        return twitterService.getTimeline();
    }

/*    @PostMapping("/Authentication")
    public void createAuthentication(@RequestBody Authentication authentication){
    }*/


  //  public TestRedis add
}

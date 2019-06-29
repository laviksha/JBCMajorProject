package com.gfg.JBCMajorProject.JBCMajorProject.controller;

import com.gfg.JBCMajorProject.JBCMajorProject.model.TimelineStatus;
import com.gfg.JBCMajorProject.JBCMajorProject.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TwitterController {

    @Autowired
    TwitterService twitterService;

    @GetMapping("/timeline")
    public List<TimelineStatus> getTimeline(){
        return twitterService.getTimeline();
    }
}

package com.gfg.JBCMajorProject.JBCMajorProject.service;

import com.gfg.JBCMajorProject.JBCMajorProject.dao.TwitterDao;
import com.gfg.JBCMajorProject.JBCMajorProject.model.Authentication;
import com.gfg.JBCMajorProject.JBCMajorProject.model.TimelineStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

import java.util.List;
import java.util.Map;

@Service
public class TwitterService {
    @Autowired
    TwitterDao twitterDao;

    public Map<String,String> getTimeline(){
        return twitterDao.getTimeline();
    }
    /*public void createAuthentications(Authentication authentication){
        twitterDao.createAuthentications(authentication);
    }*/

}

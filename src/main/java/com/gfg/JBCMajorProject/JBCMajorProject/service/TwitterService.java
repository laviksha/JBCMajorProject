package com.gfg.JBCMajorProject.JBCMajorProject.service;

import com.gfg.JBCMajorProject.JBCMajorProject.dao.TwitterDao;
import com.gfg.JBCMajorProject.JBCMajorProject.model.TimelineStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

import java.util.List;

@Service
public class TwitterService {
    @Autowired
    TwitterDao twitterDao;

    public List<TimelineStatus> getTimeline(){
        return twitterDao.getTimeline();
    }

}

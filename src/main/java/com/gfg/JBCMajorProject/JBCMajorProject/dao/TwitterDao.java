package com.gfg.JBCMajorProject.JBCMajorProject.dao;

import com.gfg.JBCMajorProject.JBCMajorProject.model.TimelineStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.ArrayList;
import java.util.List;

@Component
public class TwitterDao {
    @Autowired
    TimelineStatus timelineStatus;
    public TwitterFactory setAuthentications(){
        //Twitter twitter = new TwitterFactory().getInstance();
        // Twitter Consumer key & Consumer Secret
        //twitter.setOAuthConsumer("vj3kOTwbXPdYAjPo4JIHfuC2Y", "c3g25oAcyKBLB3wlxkviqKDJCzYpXfhdmOGHbtUjzzLRAzvFTs");
        // Twitter Access token & Access token Secret
       // twitter.setOAuthAccessToken(new AccessToken("1144873793346609152-7Ap6Kr0ME1oh2P1Bw4MHWnee4fpjfZ",
             //   "mEjrVgqZePbO1ij4KOfEX82jaLuVaSidaEi3iu00keiMH"));


        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("vj3kOTwbXPdYAjPo4JIHfuC2Y")
                .setOAuthConsumerSecret("c3g25oAcyKBLB3wlxkviqKDJCzYpXfhdmOGHbtUjzzLRAzvFTs")
                .setOAuthAccessToken("1144873793346609152-7Ap6Kr0ME1oh2P1Bw4MHWnee4fpjfZ")
                .setOAuthAccessTokenSecret("mEjrVgqZePbO1ij4KOfEX82jaLuVaSidaEi3iu00keiMH");
        TwitterFactory tf = new TwitterFactory(cb.build());
     //   Twitter twitter = tf.getInstance();
    return tf;
    }

    public List<TimelineStatus> getTimeline(){
        TwitterFactory tf=setAuthentications();
        Twitter twitter = tf.getInstance();

       // Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = null;
        try {
            statuses = twitter.getHomeTimeline();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        System.out.println("Showing home timeline.");

        List<TimelineStatus> list=new ArrayList<TimelineStatus>();

        for (Status status : statuses) {
            timelineStatus.setName(status.getUser().getName());
            timelineStatus.setText(status.getText());
            list.add(timelineStatus);
        }

        return list;
    }
}

package com.gfg.JBCMajorProject.JBCMajorProject.dao;

import com.gfg.JBCMajorProject.JBCMajorProject.model.TestRedis;
import com.gfg.JBCMajorProject.JBCMajorProject.model.TimelineStatus;
import com.gfg.JBCMajorProject.JBCMajorProject.repository.RedisConfig;
import com.gfg.JBCMajorProject.JBCMajorProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TwitterDao {
    @Autowired
    TimelineStatus timelineStatus;
    @Autowired
    UserRepository userRepository;

    public TwitterFactory createAuthentications(){
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

    @Autowired RedisTemplate<String, String> redisTemplate;
    public Map<String,String> getTimeline(){
        TwitterFactory tf=createAuthentications();
        Twitter twitter = tf.getInstance();
        //ConfigurableApplicationContext ctx=new AnnotationConfigApplicationContext(RedisConfig.class);
        // RedisTemplate<String, String> redisTemplate= (RedisTemplate<String, String>) ctx.getBean("redisTemplate");

        HashOperations hashOperations=redisTemplate.opsForHash();

        List<Status> statuses = null;
        try {
            statuses = twitter.getHomeTimeline();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        System.out.println("Showing home timeline.");
        List<TimelineStatus> list=new ArrayList<TimelineStatus>();
        Map<String,String> mp=new HashMap<String, String>();
        for (Status status : statuses) {
            String name=status.getUser().getName();
            if(mp.containsKey(name)){
                String temp=mp.get(name);
                temp+=status.getText();
                mp.put(name,temp);
            }
            else mp.put(name,status.getText());

        }

        for (Map.Entry<String,String> entry:mp.entrySet()){
            hashOperations.put(entry.getKey(),entry.getKey(),entry.getValue());
        }
        return mp;
    }
}

package com.gfg.JBCMajorProject.JBCMajorProject.model;

public class Authentication {
    private String ConsumerKey, ConsumerSecret, AccessToken, AccessTokenSecret;

    public Authentication() {
    }

    public Authentication(String consumerKey, String consumerSecret, String authAccessToken, String accessTokenSecret) {
        ConsumerKey = consumerKey;
        ConsumerSecret = consumerSecret;
        AccessToken = authAccessToken;
        AccessTokenSecret = accessTokenSecret;
    }


    public String getConsumerKey() {
        return ConsumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        ConsumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return ConsumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        ConsumerSecret = consumerSecret;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String authAccessToken) {
        AccessToken = authAccessToken;
    }

    public String getAccessTokenSecret() {
        return AccessTokenSecret;
    }

    public void setAccessTokenSecret(String accessTokenSecret) {
        AccessTokenSecret = accessTokenSecret;
    }
}

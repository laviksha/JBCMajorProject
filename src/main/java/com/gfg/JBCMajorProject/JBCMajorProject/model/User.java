package com.gfg.JBCMajorProject.JBCMajorProject.model;

public class User {
    private String handle;
    private int contribution;
    private int lastOnlineTimeSeconds;
    private int friendOfCount;
    private String avatar;
    private String titlePhoto;
    private int registrationTimeSeconds;

    public User() {
    }

    public User(String handle, int contribution, int lastOnlineTimeSeconds, int friendOfCount, String avatar, String titlePhoto, int registrationTimeSeconds) {
        this.handle = handle;
        this.contribution = contribution;
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
        this.friendOfCount = friendOfCount;
        this.avatar = avatar;
        this.titlePhoto = titlePhoto;
        this.registrationTimeSeconds = registrationTimeSeconds;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public int getContribution() {
        return contribution;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }

    public int getLastOnlineTimeSeconds() {
        return lastOnlineTimeSeconds;
    }

    public void setLastOnlineTimeSeconds(int lastOnlineTimeSeconds) {
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
    }

    public int getFriendOfCount() {
        return friendOfCount;
    }

    public void setFriendOfCount(int friendOfCount) {
        this.friendOfCount = friendOfCount;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTitlePhoto() {
        return titlePhoto;
    }

    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }

    public int getRegistrationTimeSeconds() {
        return registrationTimeSeconds;
    }

    public void setRegistrationTimeSeconds(int registrationTimeSeconds) {
        this.registrationTimeSeconds = registrationTimeSeconds;
    }
}

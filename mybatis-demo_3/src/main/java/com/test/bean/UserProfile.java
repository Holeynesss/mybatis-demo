package com.test.bean;

/**
 * Created by Holeyness on 2016/12/7.
 */
public class UserProfile {
    private Integer userId;
    private String bio;
    private String address;

    public UserProfile() {
    }

    public UserProfile(Integer userId, String bio, String address) {
        this.userId = userId;
        this.bio = bio;
        this.address = address;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

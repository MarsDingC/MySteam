package com.mysteam.action;

import com.mysteam.entity.User;
import com.mysteam.service.FollowService;

/**
 * Created by MarsDingC on 2018/1/8.
 */
public class FollowAction {
    public FollowService getService() {
        return service;
    }

    public void setService(FollowService service) {
        this.service = service;
    }

    FollowService service;
    int userId, followUserId, loginuserId;
    User loginuser;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(int followUserId) {
        this.followUserId = followUserId;
    }

    public int getLoginuserId() {
        return loginuserId;
    }

    public void setLoginuserId(int loginuserId) {
        this.loginuserId = loginuserId;
    }

    public User getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(User loginuser) {
        this.loginuser = loginuser;
    }

    public String insertBuddy() {
        service.insertBuddy(userId, followUserId);
        return "success";
    }

    public String deleteBuddy() {
        service.deleteBuddy(userId, followUserId);
        loginuser =service.find(loginuserId);
        return "success";
    }


}

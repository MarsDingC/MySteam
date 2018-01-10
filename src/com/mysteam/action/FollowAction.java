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
    int userId, followUserId;

    public User getNowUser() {
        return nowUser;
    }

    public void setNowUser(User nowUser) {
        this.nowUser = nowUser;
    }

    User nowUser;


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

    public String showBuddyList(){
        nowUser=service.findUser(userId);
        return "success";
    }

    public String insertBuddy() {
        service.insertBuddy(userId, followUserId);
        nowUser=service.findUser(followUserId);
        return "success";
    }

    public String deleteBuddy() {
        service.deleteBuddy(userId, followUserId);
        nowUser=service.findUser(followUserId);
        return "success";
    }


}

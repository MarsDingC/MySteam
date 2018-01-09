package com.mysteam.action;

import com.mysteam.entity.Game;
import com.mysteam.entity.User;
import com.mysteam.service.WishService;

import java.util.List;

/**
 * Created by MarsDingC on 2018/1/8.
 */
public class WishAction {
    WishService wishService;
    int userId;
    User user;



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public WishService getWishService() {
        return wishService;
    }

    public void setWishService(WishService wishService) {
        this.wishService = wishService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public String userWish(){
        user=wishService.find(userId);
        user.setWishList(wishService.findWishList(userId));
        return "success";
    }
}

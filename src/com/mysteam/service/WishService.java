package com.mysteam.service;

import com.mysteam.dao.UserDao;
import com.mysteam.entity.Game;
import com.mysteam.entity.User;

import java.util.List;

/**
 * Created by MarsDingC on 2018/1/8.
 */
public class WishService {
    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<Game> findWishList(int userId){
        return userDao.findWishByUserId(userId);
    }

    public User find(int userId){
        return userDao.findTest(userId);
    }

}

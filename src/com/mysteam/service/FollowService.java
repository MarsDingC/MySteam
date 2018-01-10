package com.mysteam.service;

import com.mysteam.dao.UserDao;
import com.mysteam.entity.User;
import com.mysteam.model.TestUser;

/**
 * Created by MarsDingC on 2018/1/8.
 */
public class FollowService {
    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void insertBuddy(int userId, int followUserId){
        userDao.insertBuddy(userId,followUserId);
    }

    public void deleteBuddy(int userId, int followUserId){
        userDao.deleteBuddy(userId,followUserId);
    }
    public User findUser(int userId){

        return userDao.findTest(userId);
    }
}

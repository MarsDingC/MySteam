package com.mysteam.service;

import com.mysteam.dao.UserDao;
import com.mysteam.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarsDingC on 2018/1/8.
 */
public class TestService {
    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User test(int userId){
        return userDao.findTest(userId);
    }
}

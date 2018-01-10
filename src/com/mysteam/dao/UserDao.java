package com.mysteam.dao;

import com.mysteam.entity.Game;
import com.mysteam.entity.User;
import com.mysteam.mapper.UserMapper;
import com.mysteam.model.TestUser;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim on 2017/12/28
 */
public class UserDao {
    private UserMapper getUserMapper() {
        ApplicationContext context = ApplicationContextSingleton.getContext();
        return (UserMapper) context.getBean("userMapper");
    }

    public void insert(User user) {
        UserMapper mapper = getUserMapper();
        mapper.insert(user);
    }

    public User findByAccountAndPassword(String account, String password) {
        UserMapper mapper = getUserMapper();
        return mapper.selectByAccountAndPassword(account,password);
    }

    public User findByUserId(Integer userId) {
        UserMapper mapper = getUserMapper();
        return mapper.selectByPrimaryKey(userId);
    }


    /*
    TODO Mars' UserDao
     */
    public void insertBuddy(int userId, int followUserId){
        //TODO 关注用户方法
    }
    public void deleteBuddy(int userId, int followUserId){
        //TODO 取消关注用户方法
        List<User> buddyList=TestUser.userList.get(0).getBuddyList();
        for(int i=0;i<buddyList.size();i++){
            if(buddyList.get(i).getUserId()==userId){
                buddyList.remove(i);
                break;
            }
        }
    }
    public List<User> findBuddyByUserId(Integer userId){
        //TODO 查询用户好友列表
        List<User> buddyList= new ArrayList<>();
        List<User> userList=TestUser.userList;
        for(int i=0;i<userList.size();i++){
            if(userList.get(i).getUserId()==userId){
                System.out.println("11111111111111111111111");
                System.out.println("11111111111111111111111");
                System.out.println("11111111111111111111111");
                System.out.println("11111111111111111111111");
                buddyList=userList.get(i).getBuddyList();
                break;
            }
        }
        return buddyList;
    }

    public List<Game> findWishByUserId(Integer userId){
        //TODO 查询用户愿望单列表
        List<Game> wishList= new ArrayList<>();
        List<User> userList=TestUser.userList;
        for(int i=0;i<userList.size();i++){
            if(userList.get(i).getUserId()==userId){
                wishList=userList.get(i).getWishList();
                break;
            }
        }
        return wishList;
    }

    public User findTest(int userId){
        User user;
        List<User> userList=TestUser.userList;
        for(int i=0;i<userList.size();i++){
            if(userList.get(i).getUserId()==userId){
                user= TestUser.userList.get(i);
                return user;
            }
        }
        return null;
    }




}

package com.mysteam.model;

import com.mysteam.entity.Game;
import com.mysteam.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MarsDingC on 2018/1/8.
 */
public class TestUser {
    public static List<User> userList=new ArrayList<>();
    static {
        User user=new User();
        user.setUserId(773854587);
        user.setAccount("cca");
        user.setBalance(998.0);

        ArrayList<User> buddyList= new ArrayList<>();
        User user1=new User();
        User user2=new User();
        User user3=new User();
        user1.setAccount("bba");
        user1.setUserId(1);
        user2.setAccount("dda");
        user2.setUserId(2);
        user3.setAccount("ppa");
        user3.setUserId(3);
        buddyList.add(user1);
        buddyList.add(user2);
        buddyList.add(user3);
        Game game1=new Game();
        game1.setGameName("尼尔·机械纪元");
        game1.setPrice(413.0);
        Game game2=new Game();
        game2.setGameName("塞尔达·荒野之息");
        game2.setPrice(430.0);
        Game game3=new Game();
        game3.setGameName("绝地求生·大逃杀");
        game3.setPrice(98.0);
        Game game4=new Game();
        game4.setGameName("wallpaper·engine");
        game4.setPrice(18.0);
        Game game5=new Game();
        game5.setGameName("纯白雪原·逐梦坦克圈");
        game5.setPrice(9.9);
        ArrayList<Game> wishList1=new ArrayList<>();
        wishList1.add(game1);
        wishList1.add(game5);
        wishList1.add(game2);
        user1.setWishList(wishList1);
        ArrayList<Game> wishList2=new ArrayList<>();
        wishList2.add(game5);
        wishList2.add(game3);
        wishList2.add(game4);
        user2.setWishList(wishList2);
        ArrayList<Game> wishList3=new ArrayList<>();
        wishList3.add(game4);
        wishList3.add(game2);
        wishList3.add(game5);
        user3.setWishList(wishList3);

        user.setBuddyList(buddyList);
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

    }
}

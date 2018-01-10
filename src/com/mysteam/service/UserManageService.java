package com.mysteam.service;

import com.mysteam.dao.GameOrderDao;
import com.mysteam.entity.Game;
import com.mysteam.entity.GameOrder;

import java.util.ArrayList;

public class UserManageService {
    GameOrderDao gameOrderDao;

    public GameOrderDao getGameOrderDao() {
        return gameOrderDao;
    }

    public void setGameOrderDao(GameOrderDao gameOrderDao) {
        this.gameOrderDao = gameOrderDao;
    }

    public ArrayList<Game> getOwnGameList(Integer userId) {
        ArrayList<GameOrder> gameOrdersList=gameOrderDao.findByUserId(userId);
        ArrayList<Game> gameList=new ArrayList<>();
        for (GameOrder gameOrder:gameOrdersList) {
            gameList.add(gameOrder.getGame());
        }
        return  gameList;
    }
}

package com.mysteam.service;

import com.mysteam.dao.GameOrderDao;
import com.mysteam.entity.Game;
import com.mysteam.entity.GameOrder;

public class StreamDownloadService
{
    private GameOrderDao gameOrderDao;

    public GameOrderDao getGameOrderDao() {
        return gameOrderDao;
    }

    public void setGameOrderDao(GameOrderDao gameOrderDao) {
        this.gameOrderDao = gameOrderDao;
    }

    public Game downloadByUIdNGId(Integer userId, Integer gameId){
        GameOrder gameOrder=gameOrderDao.findByUIdNGId(userId,gameId);
        Game game=gameOrder.getGame();
        gameOrder.setCurVersion(game.getVersion());
        return game;
    }
}

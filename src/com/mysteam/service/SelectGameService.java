package com.mysteam.service;

import com.mysteam.dao.GameDao;
import com.mysteam.entity.Game;

public class SelectGameService {
    GameDao gameDao;

    public GameDao getGameDao() {
        return gameDao;
    }

    public void setGameDao(GameDao gameDao) {
        this.gameDao = gameDao;
    }
    public Game selectGameById(Integer gameId){
        return gameDao.findByGameId(gameId);
    }
}

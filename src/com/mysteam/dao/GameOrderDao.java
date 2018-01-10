package com.mysteam.dao;

import com.mysteam.entity.Game;
import com.mysteam.entity.GameOrder;
import com.mysteam.entity.User;
import com.mysteam.mapper.GameOrderMapper;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

/**
 * Created by Tim on 2017/12/28
 */
public class GameOrderDao {
    /*
    TODO Bro_Bear's GameOrderDao
     */
    private GameOrderMapper getGameOrderMapper() {
        ApplicationContext context = ApplicationContextSingleton.getContext();
        return (GameOrderMapper) context.getBean("gameOrderMapper");
    }

    public ArrayList<GameOrder> findByUserId(Integer userId) {
//        GameOrderMapper mapper = getGameOrderMapper();
        GameOrder gameOrder = new GameOrder();
        User aa = new User();
        aa.setUserId(userId);
        gameOrder.setOwner(aa);
        Game aaaa = new Game();
        aaaa.setGameName("game");
        aaaa.setGameId(10);
        gameOrder.setGame(aaaa);
        ArrayList<GameOrder> gg = new ArrayList<>();
        gg.add(gameOrder);
        return gg;

    }

    public GameOrder findByUIdNGId(Integer userId, Integer gameId) {
        GameOrder gameOrder = new GameOrder();
        User aa = new User();
        aa.setUserId(userId);
        gameOrder.setOwner(aa);
        Game aaaa = new Game();
        aaaa.setGameName("game");
        aaaa.setGameId(10);
        gameOrder.setGame(aaaa);

        return gameOrder;
    }
}

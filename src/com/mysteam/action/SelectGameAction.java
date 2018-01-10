package com.mysteam.action;

import com.mysteam.entity.Game;
import com.mysteam.entity.Review;
import com.mysteam.service.SelectGameService;
import com.mysteam.service.SelectReviewService;
import com.opensymphony.xwork2.ActionContext;

import java.util.ArrayList;
import java.util.Map;

public class SelectGameAction {
    /*
    TODO Bro_Bear's SelectGameAction
     */
    Integer gameId;
    SelectGameService selectGameService;
    ArrayList<Review> reviewList;
SelectReviewService selectReviewService;
    public SelectGameService getSelectGameService() {
        return selectGameService;
    }

    public void setSelectGameService(SelectGameService selectGameService) {
        this.selectGameService = selectGameService;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<Review> reviewList) {
        this.reviewList = reviewList;
    }

    public SelectReviewService getSelectReviewService() {
        return selectReviewService;
    }

    public void setSelectReviewService(SelectReviewService selectReviewService) {
        this.selectReviewService = selectReviewService;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGame() {
        Game game = selectGameService.selectGameById(gameId);
        reviewList=selectReviewService.selectReviewByGId(gameId);
        if (game == null) {
            return "nofind";
        } else {
            Map request = (Map) ActionContext.getContext().get("request");
            request.put("game", game);
            return "success";
        }
    }

}

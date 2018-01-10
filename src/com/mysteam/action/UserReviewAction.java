package com.mysteam.action;

import com.mysteam.entity.Game;
import com.mysteam.entity.Review;
import com.mysteam.entity.User;
import com.mysteam.service.UserReviewService;
import com.opensymphony.xwork2.ActionContext;

import java.util.Date;
import java.util.Map;

public class UserReviewAction {
    Review review;//id 自增
    UserReviewService userReviewService;

    public UserReviewService getUserReviewService() {
        return userReviewService;
    }

    public void setUserReviewService(UserReviewService userReviewService) {
        this.userReviewService = userReviewService;
    }



    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public String pl() {
        Map session;
        Map requset;
        session = ActionContext.getContext().getSession();
        User user = (User) session.get("user");
        requset = (Map) ActionContext.getContext().get("request");
        Game game = (Game) requset.get("game");
        review.setGame(game);//设置被评论的游戏
        review.setReviewer(user);//设置评论者
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        System.out.println(df.format());// new Date()为获取当前系统时间
        review.setRevDate(new Date());//设置评论时间
        review.setVersion(game.getVersion());//设置版本
        if (userReviewService.upload(review)) {
            return "reviewSuccess";
        } else {
            return "reviewFail";
        }
    }
}

package com.mysteam.dao;

import com.mysteam.entity.Review;
import com.mysteam.mapper.ReviewMapper;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

/**
 * Created by Tim on 2017/12/28
 */
public class ReviewDao {

    /*
    TODO Bro_Bear's ReviewDao
     */
    private ReviewMapper getReviewMapper() {
        ApplicationContext context = ApplicationContextSingleton.getContext();
        return (ReviewMapper) context.getBean("reviewMapper");
    }

    public void insert(Review review) {
//        ReviewMapper mapper = getReviewMapper();
//        mapper.insert(review);
    }

    public Review findByRidNGid(Integer reviewerId, Integer gameId){
//        ReviewMapper mapper = getReviewMapper();
//        return mapper.selectByRidNGid(reviewerId,gameId);
        return null;
    }
    public ArrayList<Review> findByGid(Integer gameId){
//        ReviewMapper mapper = getReviewMapper();
//        return mapper.selectByGid(gameId);
        ArrayList<Review> reviews=new ArrayList<>();
        Review a=new Review();
        a.setContent("sdasad");
        reviews.add(a);
        return reviews;
    }
}
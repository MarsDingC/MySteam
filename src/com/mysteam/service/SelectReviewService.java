package com.mysteam.service;

import com.mysteam.dao.ReviewDao;
import com.mysteam.entity.Review;

import java.util.ArrayList;

public class SelectReviewService {
    private ReviewDao reviewDao;

    public ReviewDao getReviewDao() {
        return reviewDao;
    }

    public void setReviewDao(ReviewDao reviewDao) {
        this.reviewDao = reviewDao;
    }

    public ArrayList<Review> selectReviewByGId(Integer gameId){
        return reviewDao.findByGid(gameId);
    }
}

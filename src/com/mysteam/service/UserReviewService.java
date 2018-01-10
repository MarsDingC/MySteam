package com.mysteam.service;

import com.mysteam.dao.ReviewDao;
import com.mysteam.entity.Review;

public class UserReviewService {
    ReviewDao reviewDao;
    MyWriter myWriter;

    public ReviewDao getReviewDao() {
        return reviewDao;
    }

    public void setReviewDao(ReviewDao reviewDao) {
        this.reviewDao = reviewDao;
    }

    public MyWriter getMyWriter() {
        return myWriter;
    }

    public void setMyWriter(MyWriter myWriter) {
        this.myWriter = myWriter;
    }

    /**
     * 能否上传
     *
     * @param review
     * @return
     */
    private boolean canUpload(Review review) {
        //查找评论者距最近的一次对本游戏的评论
        Review lastReview = reviewDao.findByRidNGid(review.getReviewId(), review.getGame().getGameId());
        int n=1;//相隔n天才能再次评论
        if (lastReview == null || (review.getRevDate().getTime() - lastReview.getRevDate().getTime())/ (1000 * 60 * 60 * 24) >= n) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * 上传评论
     *
     * @param review
     * @return
     */
    public boolean upload(Review review) {
        if (canUpload(review)) {
            //屏蔽敏感词汇
            review.setContent(myWriter.pb(review.getContent()));
            reviewDao.insert(review);
        } else {
            return false;
        }
        return true;

    }
}

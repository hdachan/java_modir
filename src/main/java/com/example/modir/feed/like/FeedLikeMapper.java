package com.example.modir.feed.like;


import com.example.modir.feed.like.model.FeedLikeReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper


public interface FeedLikeMapper {
    int insFeedLike(FeedLikeReq req);
    int delFeedLike(FeedLikeReq req);
}

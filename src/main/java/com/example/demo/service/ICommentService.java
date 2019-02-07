package com.example.demo.service;

import com.example.demo.base.IBaseService;
import com.example.demo.entity.vo.CommentInfo;
import com.example.demo.queryparam.CommentQuery;

import java.util.List;

public interface ICommentService extends IBaseService<CommentInfo, CommentQuery> {
    List<CommentInfo> getForUser(CommentQuery q);
    Integer getCountForUser(CommentQuery q);
}

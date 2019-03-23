package com.example.demo.service;

import com.example.demo.base.IBaseService;
import com.example.demo.entity.vo.CommentInfo;
import com.example.demo.queryparam.CommentParam;
import com.example.demo.queryparam.CommentQuery;

import java.util.List;

/**
 * 功能与xxxMapper基本一致 ，IBaseService也是。
 * 写好xxxMapper.java后，直接复制改名 IxxxService.java即可
 */
public interface ICommentService extends IBaseService<CommentInfo, CommentQuery> {
    List<CommentInfo> getForUser(CommentQuery q);
    Integer getCountForUser(CommentQuery q);
    Integer comment(CommentParam c);
    List<CommentInfo> getCommentByUserId(Integer userId);
    CommentInfo getMostZan(Integer themeId);
}

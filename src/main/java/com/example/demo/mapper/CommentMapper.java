package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.vo.CommentInfo;
import com.example.demo.queryparam.CommentQuery;

import java.util.List;

public interface CommentMapper extends BaseMapper<CommentInfo, CommentQuery> {
    List<CommentInfo> getForUser(CommentQuery q);
    Integer getCountForUser(CommentQuery q);
}

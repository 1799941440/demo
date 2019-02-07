package com.example.demo.service;

import com.example.demo.base.BaseEntity;
import com.example.demo.entity.vo.CommentInfo;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.queryparam.CommentQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentService implements ICommentService{

    @Resource
    private CommentMapper cMapper;

    @Override
    public List<CommentInfo> getForUser(CommentQuery q) {
        return cMapper.getForUser(q);
    }

    @Override
    public Integer getCountForUser(CommentQuery q) {
        return cMapper.getCountForUser(q);
    }

    @Override
    public List<CommentInfo> getForAdmin(CommentQuery commentQuery) {
        return cMapper.getForAdmin(commentQuery);
    }

    @Override
    public Integer getCountForAdmin(CommentQuery commentQuery) {
        return cMapper.getCountForAdmin(commentQuery);
    }

    @Override
    public Integer logicDelete(BaseEntity be) {
        return cMapper.logicDelete(be);
    }

    @Override
    public Integer unDelete(Integer id) {
        return cMapper.unDelete(id);
    }

    @Override
    public Integer delete(Integer id) {
        return cMapper.delete(id);
    }

    @Override
    public CommentInfo getById(Integer id) {
        return cMapper.getById(id);
    }
}

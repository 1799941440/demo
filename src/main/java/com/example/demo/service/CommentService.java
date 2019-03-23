package com.example.demo.service;

import com.example.demo.base.BaseEntity;
import com.example.demo.entity.vo.CommentInfo;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.queryparam.CommentParam;
import com.example.demo.queryparam.CommentQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 写好 IxxxService.java 后，写一个类实现它，名字为 xxxService.java
 * 下面的 @Service 必须写上
 */
@Service
public class CommentService implements ICommentService{

    /**
     * 写一个  private xxxMapper xMapper；
     * 再 return xMapper.同名函数
     */
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
    public Integer comment(CommentParam c) {
        return cMapper.comment(c);
    }

    @Override
    public List<CommentInfo> getCommentByUserId(Integer userId) {
        return cMapper.getCommentByUserId(userId);
    }

    @Override
    public CommentInfo getMostZan(Integer themeId) {
        return cMapper.getMostZan(themeId);
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

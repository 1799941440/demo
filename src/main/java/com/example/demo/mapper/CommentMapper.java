package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.vo.CommentInfo;
import com.example.demo.queryparam.CommentParam;
import com.example.demo.queryparam.CommentQuery;

import java.util.List;

/** BaseMapper 包含许多基本函数 大部分被xml都要在标签里写全里面的函数，极个别不需要
 * 尖括号左边为返回类型，右边为统一的查询参数类 */
public interface CommentMapper extends BaseMapper<CommentInfo, CommentQuery> {
    /** 以下函数为特色业务，无法集成到基类 BaseMapper 里。都要写在对应的xml标签里 */

    /**
     * 为用户提供帖子的评论数据，其中CommentQuery的themeId不能为空
     * @param q
     * @return
     */
    List<CommentInfo> getForUser(CommentQuery q);/* xxxQuery.java 为本文件的所有函数的查询条件集合类*/

    /**
     * 为用户提供评论的数量
     * @param q
     * @return
     */
    Integer getCountForUser(CommentQuery q);

    /**
     * 评论某个帖子
     * @param c
     * @return
     */
    Integer comment(CommentParam c);/* xxxParam.java为插入数据的集合类 */

    /**
     * 获取某个用户所有的评论，用于个人中心查看我的评论
     * @param userId
     * @return
     */
    List<CommentInfo> getCommentByUserId(Integer userId);
}

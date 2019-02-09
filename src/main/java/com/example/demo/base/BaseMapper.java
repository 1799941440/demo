package com.example.demo.base;

import java.util.List;

/**
 * @author wz
 * @param <R> 返回类型
 * @param <Q> 查询参数类
 * @description 基本映射类。以下为通用接口
 */
public interface BaseMapper<R,Q extends BaseQuery> {

    /**
     * 为管理员提供数据
     * @param q
     * @return
     */
    List<R> getForAdmin(Q q);

    /**
     * 为管理员提供数量
     * @param q
     * @return
     */
    Integer getCountForAdmin(Q q);

    /**
     * 逻辑删除数据 ，用于管理员和用户逻辑删除自己的数据
     * @param be
     * @return
     */
    Integer logicDelete(BaseEntity be);

    /**
     * 逻辑恢复 ，用于管理员和用户逻辑恢复自己的数据
     * @param id
     * @return
     */
    Integer unDelete(Integer id);

    /**
     * 物理删除。仅供管理员删除
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 获取单个对象
     * @param id
     * @return
     */
    R getById(Integer id);
}

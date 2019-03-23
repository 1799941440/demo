package com.example.demo.queryparam;

import com.example.demo.base.BaseQuery;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/15 22:49
 * @description
 **/

public class EvaluateQuery extends BaseQuery{
    private Integer userId;
    private Integer targetId;
    private Integer type;
    private Integer isDelete;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}

package com.example.demo.queryparam;

import com.example.demo.base.BaseQuery;

public class ThemeQuery extends BaseQuery {
    private Integer type;
    private Integer userId;
    private Integer isDelete = 0;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

package com.example.demo.queryparam;

import com.example.demo.base.BaseQuery;

public class UserQuery extends BaseQuery {
    private Integer isDelete;
    private String userName;

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

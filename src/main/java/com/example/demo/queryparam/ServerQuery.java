package com.example.demo.queryparam;

import com.example.demo.base.BaseQuery;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/22 22:16
 * @description
 **/

public class ServerQuery extends BaseQuery{
    private Integer shopId;
    private Integer type;
    private Integer state;
    private Integer userId = 0;
    private Integer isDelete;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}

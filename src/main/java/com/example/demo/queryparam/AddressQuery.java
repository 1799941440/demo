package com.example.demo.queryparam;

import com.example.demo.base.BaseQuery;

public class AddressQuery extends BaseQuery {
    private Integer userId;//1
    private Integer isCommonAddress;//地址查询需要的参数

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsCommonAddress() {
        return isCommonAddress;
    }

    public void setIsCommonAddress(Integer isCommonAddress) {
        this.isCommonAddress = isCommonAddress;
    }
}

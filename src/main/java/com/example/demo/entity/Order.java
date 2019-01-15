package com.example.demo.entity;

import com.example.demo.base.BaseEntity;

import java.util.Date;

public class Order extends BaseEntity {
    private Integer userId;
    private Integer addressId;
    private Integer carId;
    private float amount;
    private Date createTime;
    private Date tradTime;
    private Integer orderState;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getTradTime() {
        return tradTime;
    }

    public void setTradTime(Date tradTime) {
        this.tradTime = tradTime;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }
}

package com.example.demo.entity;

import com.example.demo.base.BaseEntity;

public class OrderDetail extends BaseEntity {
    private Integer orderId;
    private Integer shopId;
    private Integer targetId;
    private Integer type;
    private Integer count;
    private float price;
    private float amount;
    private Integer JSId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Integer getJSId() {
        return JSId;
    }

    public void setJSId(Integer JSId) {
        this.JSId = JSId;
    }
}

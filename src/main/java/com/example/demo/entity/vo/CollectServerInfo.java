package com.example.demo.entity.vo;

import com.example.demo.entity.Collect;

/**
 * @author wz
 * @version 1.0
 * @date 2019/2/12 9:20
 * @description
 **/

public class CollectServerInfo extends Collect{
    private String serverName;
    private Integer shopId;
    private String describe;
    private float servePrice;
    private float goodsPrice;
    private Integer type;
    private Integer state;

    private String shopName;
    private String shopAddress;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public float getServePrice() {
        return servePrice;
    }

    public void setServePrice(float servePrice) {
        this.servePrice = servePrice;
    }

    public float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(float goodsPrice) {
        this.goodsPrice = goodsPrice;
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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }
}

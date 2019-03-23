package com.example.demo.entity.vo;

import com.example.demo.entity.Server;

import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/22 22:03
 * @description
 **/

public class ServerInfo extends Server{
    private String shopName;
    private Integer isCollect;
    private List<GoodsInfo> goodsList;

    public Integer getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Integer isCollect) {
        this.isCollect = isCollect;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<GoodsInfo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsInfo> goodsList) {
        this.goodsList = goodsList;
    }
}

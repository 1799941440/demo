package com.example.demo.entity.vo;

import com.example.demo.entity.Collect;

/**
 * @author wz
 * @version 1.0
 * @date 2019/2/12 9:20
 * @description
 **/

public class CollectGoodsInfo extends Collect{
    private Integer goodsId;
    private String goodsName;
    private Integer shopId;
    private float price;
    private String image;
    private String shopName;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}

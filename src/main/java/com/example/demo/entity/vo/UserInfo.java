package com.example.demo.entity.vo;

import com.example.demo.entity.User;

public class UserInfo extends User {
    private Integer commomAddressId = 0;
    private String shopName = "";
    private String shopImage = "";

    public Integer getCommomAddressId() {
        return commomAddressId;
    }

    public void setCommomAddressId(Integer commomAddressId) {
        this.commomAddressId = commomAddressId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage;
    }
}

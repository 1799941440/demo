package com.example.demo.entity;

import com.example.demo.base.BaseEntity;
/**/
public class Address extends BaseEntity {
    private Integer userId;//1
    private String receiver;
    private String contact;
    private String province;
    private String city;
    private String fullAddress;
    private Integer isCommonAddress;//

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public Integer getIsCommonAddress() {
        return isCommonAddress;
    }

    public void setIsCommonAddress(Integer isCommonAddress) {
        this.isCommonAddress = isCommonAddress;
    }
}

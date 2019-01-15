package com.example.demo.entity;

import com.example.demo.base.BaseEntity;

public class Car extends BaseEntity {
    private Integer brandId;
    private Integer classId;
    private Integer disId;
    private Integer userId;
    private Integer WPId;
    private String year;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getDisId() {
        return disId;
    }

    public void setDisId(Integer disId) {
        this.disId = disId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWPId() {
        return WPId;
    }

    public void setWPId(Integer WPId) {
        this.WPId = WPId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

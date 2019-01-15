package com.example.demo.entity;

import com.example.demo.base.BaseEntity;

public class CarMaintainParam extends BaseEntity {
    private Integer brandId;
    private Integer classId;
    private Integer disId;
    private String year;
    private float jy;
    private float fdy;
    private float scy;
    private Integer hhs;
    private float bsxy;

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getJy() {
        return jy;
    }

    public void setJy(float jy) {
        this.jy = jy;
    }

    public float getFdy() {
        return fdy;
    }

    public void setFdy(float fdy) {
        this.fdy = fdy;
    }

    public float getScy() {
        return scy;
    }

    public void setScy(float scy) {
        this.scy = scy;
    }

    public Integer getHhs() {
        return hhs;
    }

    public void setHhs(Integer hhs) {
        this.hhs = hhs;
    }

    public float getBsxy() {
        return bsxy;
    }

    public void setBsxy(float bsxy) {
        this.bsxy = bsxy;
    }
}

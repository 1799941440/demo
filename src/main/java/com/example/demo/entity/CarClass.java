package com.example.demo.entity;

import com.example.demo.base.BaseEntity;

public class CarClass extends BaseEntity {
    private Integer brandId;
    private String className;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

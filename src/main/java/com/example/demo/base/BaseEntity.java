package com.example.demo.base;

/**
 * @author wz
 * @description 基本实体类，
 */

public class BaseEntity {
    private Integer id;
    private Integer isDelete = 0;
    private String delReason = "";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getDelReason() {
        return delReason;
    }

    public void setDelReason(String delReason) {
        this.delReason = delReason;
    }
}

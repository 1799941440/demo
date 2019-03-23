package com.example.demo.entity.vo;

import com.example.demo.entity.Evaluate;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/15 22:57
 * @description
 **/

public class EvaluateInfo extends Evaluate{
    private Integer userAge;
    private String userSex;
    private String userName;

    private String targetName;

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
}

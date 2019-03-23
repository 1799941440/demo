package com.example.demo.queryparam;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/15 22:52
 * @description
 **/

public class EvaluateParam{
    private Integer userId;
    private Integer targetId;
    private Integer type;
    private Integer star;
    private String evaluate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }
}

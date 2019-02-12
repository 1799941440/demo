package com.example.demo.entity.vo;

import com.example.demo.entity.Collect;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author wz
 * @version 1.0
 * @date 2019/2/12 9:20
 * @description 帖子收藏信息展示
 **/

public class CollectThemeInfo extends Collect{
    private Integer themeId;
    private Integer ownerId;
    private String userName;
    private Integer commentTimes;
    private Integer collectTimes;
    private String title;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
    private Date pushTime;
    private Integer themeType;
    private String images;
    private Integer imageCount;

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCommentTimes() {
        return commentTimes;
    }

    public void setCommentTimes(Integer commentTimes) {
        this.commentTimes = commentTimes;
    }

    public Integer getCollectTimes() {
        return collectTimes;
    }

    public void setCollectTimes(Integer collectTimes) {
        this.collectTimes = collectTimes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Integer getThemeType() {
        return themeType;
    }

    public void setThemeType(Integer themeType) {
        this.themeType = themeType;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getImageCount() {
        return imageCount;
    }

    public void setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
    }
}

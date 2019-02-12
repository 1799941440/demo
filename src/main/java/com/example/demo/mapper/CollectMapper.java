package com.example.demo.mapper;

import com.example.demo.entity.Collect;
import com.example.demo.entity.vo.CollectGoodsInfo;
import com.example.demo.entity.vo.CollectServerInfo;
import com.example.demo.entity.vo.CollectThemeInfo;

import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/2/12 9:38
 * @description
 **/

public interface CollectMapper{
    List<CollectThemeInfo> getThemeCollectByUserId(Integer userId);
    List<CollectGoodsInfo> getGoodsCollectByUserId(Integer userId);
    Integer unCollect(Collect c);
    List<CollectServerInfo> getServerCollectByUserId(Integer userId);
    Integer unCollectById(Integer collectId);
    Integer collect(Collect c);
}

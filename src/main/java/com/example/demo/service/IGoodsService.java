package com.example.demo.service;

import com.example.demo.base.IBaseService;
import com.example.demo.entity.vo.GoodsInfo;
import com.example.demo.queryparam.GoodsQuery;

import java.util.List;

public interface IGoodsService extends IBaseService<GoodsInfo, GoodsQuery> {
    List<GoodsInfo> getForUser(GoodsQuery g);
    Integer getCountForUser(GoodsQuery g);
}

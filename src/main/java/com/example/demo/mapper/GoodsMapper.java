package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.vo.GoodsInfo;
import com.example.demo.queryparam.GoodsQuery;

import java.util.List;

public interface GoodsMapper extends BaseMapper<GoodsInfo, GoodsQuery> {
    List<GoodsInfo> getForUser(GoodsQuery g);
    Integer getCountForUser(GoodsQuery g);
}

package com.example.demo.service;

import com.example.demo.base.BaseEntity;
import com.example.demo.entity.vo.GoodsInfo;
import com.example.demo.mapper.GoodsMapper;
import com.example.demo.queryparam.GoodsQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/2/9 8:41
 * @description
 **/

@Service
public class GoodsService implements IGoodsService{

    @Resource
    private GoodsMapper gMapper;

    @Override
    public List<GoodsInfo> getForAdmin(GoodsQuery goodsQuery) {
        return gMapper.getForAdmin(goodsQuery);
    }

    @Override
    public Integer getCountForAdmin(GoodsQuery goodsQuery) {
        return gMapper.getCountForAdmin(goodsQuery);
    }

    @Override
    public Integer logicDelete(BaseEntity be) {
        return gMapper.logicDelete(be);
    }

    @Override
    public Integer unDelete(Integer id) {
        return gMapper.unDelete(id);
    }

    @Override
    public Integer delete(Integer id) {
        return gMapper.delete(id);
    }

    @Override
    public GoodsInfo getById(Integer id) {
        return gMapper.getById(id);
    }

    @Override
    public List<GoodsInfo> getForUser(GoodsQuery g) {
        return gMapper.getForUser(g);
    }

    @Override
    public Integer getCountForUser(GoodsQuery g) {
        return gMapper.getCountForUser(g);
    }
}

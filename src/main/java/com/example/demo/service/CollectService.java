package com.example.demo.service;

import com.example.demo.entity.Collect;
import com.example.demo.entity.vo.CollectGoodsInfo;
import com.example.demo.entity.vo.CollectServerInfo;
import com.example.demo.entity.vo.CollectThemeInfo;
import com.example.demo.mapper.CollectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/2/12 10:16
 * @description
 **/

@Service
public class CollectService implements ICollectService{

    @Resource
    private CollectMapper cMapper;

    @Override
    public List<CollectThemeInfo> getThemeCollectByUserId(Integer userId) {
        return cMapper.getThemeCollectByUserId(userId);
    }

    @Override
    public List<CollectGoodsInfo> getGoodsCollectByUserId(Integer userId) {
        return cMapper.getGoodsCollectByUserId(userId);
    }

    @Override
    public List<CollectServerInfo> getServerCollectByUserId(Integer userId) {
        return cMapper.getServerCollectByUserId(userId);
    }

    @Override
    public Integer unCollect(Collect c) {
        return cMapper.unCollect(c);
    }

    @Override
    public Integer unCollectById(Integer collectId) {
        return cMapper.unCollectById(collectId);
    }

    @Override
    public Integer collect(Collect c) {
        return cMapper.collect(c);
    }
}

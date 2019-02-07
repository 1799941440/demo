package com.example.demo.service;

import com.example.demo.base.BaseEntity;
import com.example.demo.entity.Shop;
import com.example.demo.entity.vo.ShopInfo;
import com.example.demo.mapper.ShopMapper;
import com.example.demo.queryparam.ShopQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopService implements IShopService{

    @Resource
    private ShopMapper sMapper;

    @Override
    public List<ShopInfo> getForAdmin(ShopQuery shopQuery) {
        return sMapper.getForAdmin(shopQuery);
    }

    @Override
    public Integer getCountForAdmin(ShopQuery shopQuery) {
        return sMapper.getCountForAdmin(shopQuery);
    }

    @Override
    public Integer logicDelete(BaseEntity be) {
        return sMapper.logicDelete(be);
    }

    @Override
    public Integer unDelete(Integer id) {
        return sMapper.unDelete(id);
    }

    @Override
    public Integer delete(Integer id) {
        return sMapper.delete(id);
    }

    @Override
    public ShopInfo getById(Integer id) {
        return sMapper.getById(id);
    }

    @Override
    public Integer applySK(Shop shop) {
        return sMapper.applySK(shop);
    }
}

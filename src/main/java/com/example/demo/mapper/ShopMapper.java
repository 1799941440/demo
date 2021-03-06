package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.Shop;
import com.example.demo.entity.vo.ShopInfo;
import com.example.demo.queryparam.ShopQuery;

public interface ShopMapper extends BaseMapper<ShopInfo, ShopQuery> {
    Integer applySK(Shop shop);
}

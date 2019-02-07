package com.example.demo.service;

import com.example.demo.base.IBaseService;
import com.example.demo.entity.Shop;
import com.example.demo.entity.vo.ShopInfo;
import com.example.demo.queryparam.ShopQuery;

public interface IShopService extends IBaseService<ShopInfo, ShopQuery> {
    Integer applySK(Shop shop);
}

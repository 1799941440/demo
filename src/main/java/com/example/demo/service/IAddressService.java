package com.example.demo.service;

import com.example.demo.base.IBaseService;
import com.example.demo.entity.Address;
import com.example.demo.queryparam.AddressQuery;

import java.util.List;

public interface IAddressService extends IBaseService<Address, AddressQuery> {
        List<Address> getForUser(Integer userId);
        Integer getCountForUser(Integer userId);
}

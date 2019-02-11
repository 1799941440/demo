package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.Address;
import com.example.demo.queryparam.AddressQuery;

import java.util.List;

public interface AddressMapper extends BaseMapper<Address,AddressQuery> {
    List<Address> getForUser(Integer userId);
    Integer getCountForUser(Integer userId);
}

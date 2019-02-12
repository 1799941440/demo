package com.example.demo.service;

import com.example.demo.base.BaseEntity;
import com.example.demo.entity.Address;
import com.example.demo.mapper.AddressMapper;
import com.example.demo.queryparam.AddressQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressService implements IAddressService{

    @Resource
    private AddressMapper aMapper;

    @Override
    public List<Address> getForUser(Integer userId) {
        return aMapper.getForUser(userId);
    }

    @Override
    public Integer getCountForUser(Integer userId) {
        return aMapper.getCountForUser(userId);
    }

    @Override
    public Integer add(Address address) {
        return aMapper.add(address);
    }

    @Override
    public Address getCommonAddress(Integer userId) {
        return aMapper.getCommonAddress(userId);
    }

    @Override
    public Integer update(Address address) {
        return aMapper.update(address);
    }

    @Override
    public List<Address> getForAdmin(AddressQuery addressQuery) {
        return aMapper.getForAdmin(addressQuery);
    }

    @Override
    public Integer getCountForAdmin(AddressQuery addressQuery) {
        return null;
    }

    @Override
    public Integer logicDelete(BaseEntity be) {
        return aMapper.logicDelete(be);
    }

    @Override
    public Integer unDelete(Integer id) {
        return aMapper.unDelete(id);
    }

    @Override
    public Integer delete(Integer id) {
        return aMapper.delete(id);
    }

    @Override
    public Address getById(Integer id) {
        return aMapper.getById(id);
    }
}

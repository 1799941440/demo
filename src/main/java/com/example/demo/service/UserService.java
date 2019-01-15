package com.example.demo.service;

import com.example.demo.base.BaseEntity;
import com.example.demo.entity.User;
import com.example.demo.entity.vo.UserInfo;
import com.example.demo.mapper.UserMapper;
import com.example.demo.queryparam.LoginParam;
import com.example.demo.queryparam.UserQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements IUserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserInfo> getForAdmin(UserQuery userQuery) {
        return userMapper.getForAdmin(userQuery);
    }

    @Override
    public Integer getCountForAdmin(UserQuery userQuery) {
        return userMapper.getCountForAdmin(userQuery);
    }

    @Override
    public UserInfo login(LoginParam loginParam) {
        return userMapper.login(loginParam);
    }

    @Override
    public Integer resetPassword(Integer id) {
        return userMapper.resetPassword(id);
    }

    @Override
    public Integer logicDelete(BaseEntity be) {
        return userMapper.logicDelete(be);
    }

    @Override
    public Integer delete(Integer id) {
        return userMapper.delete(id);
    }

    @Override
    public Integer updateUserAmount(User user) {
        return userMapper.updateUserAmount(user);
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public Integer unDelete(Integer id) {
        return userMapper.unDelete(id);
    }
}

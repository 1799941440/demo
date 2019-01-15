package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.User;
import com.example.demo.entity.vo.UserInfo;
import com.example.demo.queryparam.LoginParam;
import com.example.demo.queryparam.UserQuery;

public interface UserMapper extends BaseMapper<UserInfo, UserQuery> {
    UserInfo login(LoginParam loginParam);
    Integer updateUser(User user);
    Integer updateUserAmount(User user);
    Integer resetPassword(Integer id);
    User findUserById(Integer id);
}

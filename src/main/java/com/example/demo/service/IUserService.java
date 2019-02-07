package com.example.demo.service;

import com.example.demo.base.IBaseService;
import com.example.demo.entity.User;
import com.example.demo.entity.vo.UserInfo;
import com.example.demo.queryparam.LoginParam;
import com.example.demo.queryparam.UserQuery;

public interface IUserService extends IBaseService<UserInfo, UserQuery> {
    UserInfo login(LoginParam loginParam);
    Integer resetPassword(Integer id);
    Integer updateUserAmount(User user);
    User findUserById(Integer id);
}

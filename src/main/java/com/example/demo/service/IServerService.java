package com.example.demo.service;

import com.example.demo.base.IBaseService;
import com.example.demo.entity.vo.ServerInfo;
import com.example.demo.queryparam.ServerQuery;

import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/23 18:56
 * @description
 **/

public interface IServerService extends IBaseService<ServerInfo, ServerQuery>{
    List<ServerInfo> getForUser(ServerQuery sq);
    Integer getCountForUser(ServerQuery sq);
}

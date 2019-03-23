package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.vo.ServerInfo;
import com.example.demo.queryparam.ServerQuery;

import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/22 22:15
 * @description
 **/

public interface ServerMapper extends BaseMapper<ServerInfo, ServerQuery>{
    List<ServerInfo> getForUser(ServerQuery sq);
    Integer getCountForUser(ServerQuery sq);
}

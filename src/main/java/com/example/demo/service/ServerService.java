package com.example.demo.service;

import com.example.demo.base.BaseEntity;
import com.example.demo.entity.vo.ServerInfo;
import com.example.demo.mapper.ServerMapper;
import com.example.demo.queryparam.ServerQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/23 18:57
 * @description
 **/

@Service
public class ServerService implements IServerService{

    @Resource
    private ServerMapper sMapper;

    @Override
    public List<ServerInfo> getForUser(ServerQuery sq) {
        return sMapper.getForUser(sq);
    }

    @Override
    public Integer getCountForUser(ServerQuery sq) {
        return sMapper.getCountForUser(sq);
    }

    @Override
    public List<ServerInfo> getForAdmin(ServerQuery serverQuery) {
        return sMapper.getForAdmin(serverQuery);
    }

    @Override
    public Integer getCountForAdmin(ServerQuery serverQuery) {
        return sMapper.getCountForUser(serverQuery);
    }

    @Override
    public Integer logicDelete(BaseEntity be) {
        return sMapper.logicDelete(be);
    }

    @Override
    public Integer unDelete(Integer id) {
        return sMapper.unDelete(id);
    }

    @Override
    public Integer delete(Integer id) {
        return sMapper.delete(id);
    }

    @Override
    public ServerInfo getById(Integer id) {
        return sMapper.getById(id);
    }
}

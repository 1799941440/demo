package com.example.demo.service;

import com.example.demo.base.BaseEntity;
import com.example.demo.entity.vo.EvaluateInfo;
import com.example.demo.mapper.EvaluateMapper;
import com.example.demo.queryparam.EvaluateQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/15 23:25
 * @description
 **/

@Service
public class EvaluateService implements IEvaluateService{

    @Resource
    private EvaluateMapper eMapper;

    @Override
    public List<EvaluateInfo> getGoodsEva(EvaluateQuery eq) {
        return eMapper.getGoodsEva(eq);
    }

    @Override
    public List<EvaluateInfo> getServerEva(EvaluateQuery eq) {
        return eMapper.getServerEva(eq);
    }

    @Override
    public List<EvaluateInfo> getJishiEva(EvaluateQuery eq) {
        return eMapper.getJishiEva(eq);
    }

    @Override
    public List<EvaluateInfo> getShopEva(EvaluateQuery eq) {
        return eMapper.getShopEva(eq);
    }

    @Override
    public Integer getCountForUser(EvaluateQuery eq) {
        return eMapper.getCountForUser(eq);
    }

    @Override
    public List<EvaluateInfo> getForAdmin(EvaluateQuery evaluateQuery) {
        return eMapper.getForAdmin(evaluateQuery);
    }

    @Override
    public Integer getCountForAdmin(EvaluateQuery evaluateQuery) {
        return eMapper.getCountForAdmin(evaluateQuery);
    }

    @Override
    public Integer logicDelete(BaseEntity be) {
        return eMapper.logicDelete(be);
    }

    @Override
    public Integer unDelete(Integer id) {
        return eMapper.unDelete(id);
    }

    @Override
    public Integer delete(Integer id) {
        return eMapper.delete(id);
    }

    @Override
    public EvaluateInfo getById(Integer id) {
        return eMapper.getById(id);
    }
}

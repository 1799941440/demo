package com.example.demo.mapper;

import com.example.demo.base.BaseMapper;
import com.example.demo.entity.vo.EvaluateInfo;
import com.example.demo.queryparam.EvaluateQuery;

import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/15 22:56
 * @description
 **/

public interface EvaluateMapper extends BaseMapper<EvaluateInfo, EvaluateQuery>{
    List<EvaluateInfo> getGoodsEva(EvaluateQuery eq);
    List<EvaluateInfo> getServerEva(EvaluateQuery eq);
    List<EvaluateInfo> getJishiEva(EvaluateQuery eq);
    List<EvaluateInfo> getShopEva(EvaluateQuery eq);
    Integer getCountForUser(EvaluateQuery eq);
}
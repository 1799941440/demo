package com.example.demo.service;

import com.example.demo.base.IBaseService;
import com.example.demo.entity.vo.EvaluateInfo;
import com.example.demo.queryparam.EvaluateQuery;

import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/15 23:23
 * @description
 **/

public interface IEvaluateService extends IBaseService<EvaluateInfo, EvaluateQuery>{
    List<EvaluateInfo> getGoodsEva(EvaluateQuery eq);
    List<EvaluateInfo> getServerEva(EvaluateQuery eq);
    List<EvaluateInfo> getJishiEva(EvaluateQuery eq);
    List<EvaluateInfo> getShopEva(EvaluateQuery eq);
    Integer getCountForUser(EvaluateQuery eq);
}

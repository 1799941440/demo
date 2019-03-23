package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.queryparam.EvaluateQuery;
import com.example.demo.service.IEvaluateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/15 23:29
 * @description
 **/

@RestController
@RequestMapping("/EvaluateAction")
public class EvaluateController{

    @Resource
    private IEvaluateService iEService;

    @RequestMapping("/getForUser")
    public JsonResult getForUser(EvaluateQuery eq) {
        JsonResult js  = new JsonResult();
        if(eq.getType() == null) {
            js.setErrMsg("参数不完整");
            return js;
        } else if (eq.getType() == 0) {
            js.add(iEService.getGoodsEva(eq));
            js.setMsg("获取商品评价成功");
        }  else if (eq.getType() == 1) {
            js.add(iEService.getServerEva(eq));
            js.setMsg("获取服务评价成功");
        } else if (eq.getType() == 2) {
            js.add(iEService.getJishiEva(eq));
            js.setMsg("获取技师评价成功");
        } else if (eq.getType() == 3) {
            js.add(iEService.getShopEva(eq));
            js.setMsg("获取店铺评价成功");
        }
        js.setTotal(iEService.getCountForUser(eq));
        return js;
    }
}

package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.queryparam.GoodsQuery;
import com.example.demo.service.IGoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wz
 * @version 1.0
 * @date 2019/2/9 8:47
 * @description
 **/

@RestController
@RequestMapping("/GoodsAction")
public class GoodsController {

    @Resource
    private IGoodsService iGService;

    @RequestMapping("/getForUser")
    public JsonResult getForUser(GoodsQuery g){
        JsonResult js = new JsonResult();
        if(g.getUserId() == null || g.getUserId() == 0){
            js.setErrMsg("参数传递不完整！");
        }else{
            js.add(iGService.getForUser(g));
            js.setTotal(iGService.getCountForUser(g));
        }
        return js;
    }

    @RequestMapping("/getForAdmin")
    public JsonResult getForAdmin(GoodsQuery g){
        JsonResult js = new JsonResult();
        js.add(iGService.getForAdmin(g));
        js.setTotal(iGService.getCountForAdmin(g));
        return js;
    }

    @RequestMapping("/getById")
    public JsonResult getById(Integer id){
        JsonResult js = new JsonResult();
        js.add(iGService.getById(id));
        return js;
    }
}

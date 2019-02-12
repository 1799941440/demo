package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.entity.Collect;
import com.example.demo.service.ICollectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wz
 * @version 1.0
 * @date 2019/2/12 10:21
 * @description
 **/

@RestController
@RequestMapping("/CollectAction")
public class CollectController{

    @Resource
    private ICollectService iCService;

    @RequestMapping("/getCollectByUserId")
    public JsonResult getGoodsCollectByUserId(Integer userId,Integer type)throws Exception{
        JsonResult js = new JsonResult();
        if(type == 0){
            js.add(iCService.getThemeCollectByUserId(userId));
            if(js.getPageSize() == 0){
                js.setMsg("没有收藏");
            }else{
                js.setMsg("查询帖子收藏成功");
            }
        }else if(type == 1){
            js.add(iCService.getGoodsCollectByUserId(userId));
            if(js.getPageSize() == 0){
                js.setMsg("没有收藏");
            }else{
                js.setMsg("查询商品收藏成功");
            }
        }else{
            js.add(iCService.getServerCollectByUserId(userId));
            if(js.getPageSize() == 0){
                js.setMsg("没有收藏");
            }else{
                js.setMsg("查询服务收藏成功");
            }
        }
        return js;
    }

    @RequestMapping("/unCollect")
    public JsonResult unCollect(Collect c){
        JsonResult js = new JsonResult();
        if(iCService.unCollect(c) == 1){
            js.setMsg("取消收藏成功");
        }else{
            js.setErrMsg("取消收藏失败");
        }
        return js;
    }

    @RequestMapping("/unCollectById")
    public JsonResult unCollectById(Integer id){
        JsonResult js = new JsonResult();
        if(iCService.unCollectById(id) == 1){
            js.setMsg("取消收藏成功");
        }else{
            js.setErrMsg("取消收藏失败");
        }
        return js;
    }

    @RequestMapping("/collect")
    public JsonResult collect(Collect c){
        JsonResult js = new JsonResult();
        if(iCService.collect(c) == 1){
            js.setMsg("收藏成功");
        }else{
            js.setErrMsg("收藏失败");
        }
        return js;
    }
}

package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.queryparam.ShopQuery;
import com.example.demo.service.IShopService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ShopAction")
public class ShopController {

    @Resource
    private IShopService iSService;

    @RequestMapping("/getForAdmin")
    public JsonResult getForAdmin(ShopQuery query){
        JsonResult js = new JsonResult();
        js.add(iSService.getForAdmin(query));
        js.setTotal(iSService.getCountForAdmin(query));
        return js;
    }
}

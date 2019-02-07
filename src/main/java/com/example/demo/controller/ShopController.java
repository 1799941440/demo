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
    private IShopService ISService;

    @RequestMapping("/getForAdmin")
    public JsonResult getForAdmin(ShopQuery query){
        JsonResult js = new JsonResult();
        js.add(ISService.getForAdmin(query));
        js.setTotal(ISService.getCountForAdmin(query));
        return js;
    }
}

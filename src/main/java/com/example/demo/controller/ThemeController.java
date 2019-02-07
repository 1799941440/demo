package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.queryparam.ThemeQuery;
import com.example.demo.service.IThemeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ThemeAction")
public class ThemeController {

    @Resource
    private IThemeService ITService;

    @RequestMapping("/getForUser")
    public JsonResult getForUser(ThemeQuery query){
        JsonResult js = new JsonResult();
        js.add(ITService.getForUser(query));
        js.setTotal(ITService.getCountForUser(query));
        return js;
    }

    @RequestMapping("/getForAdmin")
    public JsonResult getForAdmin(ThemeQuery query){
        JsonResult js = new JsonResult();
        js.add(ITService.getForAdmin(query));
        js.setTotal(ITService.getCountForAdmin(query));
        return js;
    }
}

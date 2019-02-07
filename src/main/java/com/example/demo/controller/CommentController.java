package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.queryparam.CommentQuery;
import com.example.demo.service.ICommentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/CommentAction")
public class CommentController {

    @Resource
    private ICommentService service;

    @RequestMapping("/getByThemeIdForUser")
    public JsonResult getUser(CommentQuery query){
        JsonResult js = new JsonResult();
        js.add(service.getForUser(query));
        js.setTotal(service.getCountForUser(query));
        return js;
    }

    @RequestMapping("/getForAdmin")
    public JsonResult getForAdmin(CommentQuery query){
        JsonResult js = new JsonResult();
        js.add(service.getForAdmin(query));
        js.setTotal(service.getCountForAdmin(query));
        return js;
    }
}

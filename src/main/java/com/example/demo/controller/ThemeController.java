package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.entity.vo.CommentInfo;
import com.example.demo.entity.vo.ThemeInfo;
import com.example.demo.queryparam.ThemeQuery;
import com.example.demo.service.ICommentService;
import com.example.demo.service.IThemeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ThemeAction")
public class ThemeController {

    @Resource
    private IThemeService iTService;
    @Resource
    private ICommentService iCService;

    @RequestMapping("/getForUser")
    public JsonResult getForUser(ThemeQuery query){
        JsonResult js = new JsonResult();
        List<ThemeInfo> list = iTService.getForUser(query);
        setMostZan(list);
        js.add(list);
        js.setTotal(iTService.getCountForUser(query));
        return js;
    }

    @RequestMapping("/getForAdmin")
    public JsonResult getForAdmin(ThemeQuery query){
        JsonResult js = new JsonResult();
        js.add(iTService.getForAdmin(query));
        js.setTotal(iTService.getCountForAdmin(query));
        return js;
    }

    private void setMostZan(List<ThemeInfo> list) {
        CommentInfo tTemp = null;
        for(ThemeInfo t :list) {
            tTemp = iCService.getMostZan(t.getId());
            if (tTemp != null) {
                t.setMostZan(tTemp.getReply());
            }
        }
    }
}

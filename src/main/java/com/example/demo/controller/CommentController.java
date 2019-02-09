package com.example.demo.controller;

import com.example.demo.base.BaseEntity;
import com.example.demo.base.JsonResult;
import com.example.demo.queryparam.CommentParam;
import com.example.demo.queryparam.CommentQuery;
import com.example.demo.service.ICommentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
 * @RestController 为必写，固定格式
 */
@RestController
/*
 *  RequestMapping("/xxxAction")：访问路径 必写，格式如下所示
 */
@RequestMapping("/CommentAction")
/**
 * @author wz
 * 类名为  xxxController
 */
public class CommentController {

    /**
     * @ Resource 必写 导入的必须为 IxxxService,不能是xxxService。
     */
    @Resource
    private ICommentService iCService;

    @RequestMapping("/getByThemeIdForUser")
    public JsonResult getUser(CommentQuery query){
        JsonResult js = new JsonResult();
        js.add(iCService.getForUser(query));
        js.setTotal(iCService.getCountForUser(query));
        return js;
    }

    @RequestMapping("/getForAdmin")
    public JsonResult getForAdmin(CommentQuery query){
        JsonResult js = new JsonResult();
        js.add(iCService.getForAdmin(query));
        js.setTotal(iCService.getCountForAdmin(query));
        return js;
    }

    @RequestMapping("/getByUserId")
    public JsonResult getByUserId(Integer userId){
        JsonResult js = new JsonResult();
        js.add(iCService.getCommentByUserId(userId));
        return js;
    }

    @RequestMapping("/comment")
    public JsonResult comment(CommentParam c){
        JsonResult js = new JsonResult();
        if(iCService.comment(c) == 1){
            js.setMsg("评论成功");
        }else{
            js.setErrMsg("评论失败");
        }
        return js;
    }

    @RequestMapping("/delete")
    public JsonResult delete(Integer commentId){
        JsonResult js = new JsonResult();
        if(iCService.delete(commentId) == 1){
            js.setMsg("永久删除成功");
        }else{
            js.setErrMsg("永久删除失败");
        }
        return js;
    }

    @RequestMapping("/logicDelete")
    public JsonResult delete(BaseEntity be){
        JsonResult js = new JsonResult();
        if(iCService.logicDelete(be) == 1){
            js.setMsg("逻辑删除成功");
        }else{
            js.setErrMsg("逻辑删除失败");
        }
        return js;
    }

    @RequestMapping("/unDelete")
    public JsonResult unDelete(Integer commentId){
        JsonResult js = new JsonResult();
        if(iCService.unDelete(commentId) == 1){
            js.setMsg("逻辑恢复成功");
        }else{
            js.setErrMsg("逻辑恢复失败");
        }
        return js;
    }
}

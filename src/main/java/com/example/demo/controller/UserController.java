package com.example.demo.controller;

import com.example.demo.base.BaseEntity;
import com.example.demo.base.JsonResult;
import com.example.demo.entity.User;
import com.example.demo.entity.vo.UserInfo;
import com.example.demo.queryparam.LoginParam;
import com.example.demo.queryparam.UserQuery;
import com.example.demo.service.IUserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/UserAction")
public class UserController {

    @Resource
    private IUserService service;

    @RequestMapping("/getForAdmin")
    public JsonResult getUser(UserQuery query){
        JsonResult js = new JsonResult();
        js.add(service.getForAdmin(query));
        js.setTotal(service.getCountForAdmin(query));
        return js;
    }

    @RequestMapping("/resetPassword")
    public JsonResult resetPassword(Integer id){
        JsonResult js = new JsonResult();
        if(service.resetPassword(id) == 1){
            js.setMsg("id为" + id + "的用户重置密码成功");
        }else{
            js.setErrMsg("操作失败");
        }
        return js;
    }

    @RequestMapping("/logicDelete")
    public JsonResult logicDelete(BaseEntity be){
        JsonResult js = new JsonResult();
        if(service.logicDelete(be) == 1){
            js.setMsg("id为" + be.getId() + "的用户逻辑删除成功");
        }else{
            js.setErrMsg("操作失败");
        }
        return js;
    }

    @RequestMapping("/unDelete")
    public JsonResult unDelete(Integer id){
        JsonResult js = new JsonResult();
        if(service.unDelete(id) == 1){
            js.setMsg("id为" + id + "的用户逻辑恢复成功");
        }else{
            js.setErrMsg("操作失败");
        }
        return js;
    }

    @RequestMapping("/delete")
    public JsonResult delete(Integer id){
        JsonResult js = new JsonResult();
        if(service.delete(id) == 1){
            js.setMsg("id为" + id + "的用户物理删除成功");
        }else{
            js.setErrMsg("操作失败");
        }
        return js;
    }


    @CrossOrigin
    @RequestMapping("/login")
    public JsonResult login(LoginParam loginParam){
        JsonResult js = new JsonResult();
        UserInfo u = service.login(loginParam);
        u.setPassword("");
        js.add(u);
        if(js.getPageSize() == 1){
            js.setMsg("登录成功");
        }else {
            js.setErrMsg("登录失败，请联系管理员获取帮助");
        }
        return js;
    }

    @RequestMapping("/charge")
    public JsonResult charge(User user){
        JsonResult js = new JsonResult();
        User u = service.findUserById(user.getId());
        u.setBalance(u.getBalance()+user.getBalance());
        Integer i = service.updateUserAmount(u);
        if(i == 1){
            js.setMsg("充值余额成功");
        }else{
            js.setErrMsg("充值余额失败");
        }
        return js;
    }
}

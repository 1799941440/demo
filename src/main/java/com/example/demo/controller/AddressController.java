package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.entity.Address;
import com.example.demo.service.IAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/AddressAction")
public class AddressController {

    @Resource
    private IAddressService iAService;

    //查看用户的全部收货地址
    @RequestMapping("/getForUser")
    public JsonResult getForUser(Integer userId){
        JsonResult js = new JsonResult();
        js.add(iAService.getForUser(userId));
        js.setTotal(iAService.getCountForUser(userId));
        return js;
    }

    //删除用户的收货地址
    @RequestMapping("/delete")
    public JsonResult delete(Integer id){
        JsonResult js = new JsonResult();
        if(iAService.delete(id) == 1){
            js.setMsg("删除成功");
        }else{
            js.setErrMsg("删除失败");
        }
        return js;
    }
    //添加用户的收货地址
    @RequestMapping("/addAddress")
    public JsonResult addAddress(Address address){
        JsonResult js = new JsonResult();
        js.add(address);
        return js;
    }

    //查询用户的 常用收货地址
    @RequestMapping("/getCommonAddress")
    public JsonResult getCommonAddress(Integer userId){
        JsonResult js = new JsonResult();
        if(iAService.getById(userId).getIsCommonAddress()==0){
            js.setMsg(iAService.getById(userId).getFullAddress());
        }
        return js;
    }

    //1、targetId是用户表的id 还是address表的id？
    //2、为什么在entity中每个表自身的id没有呢？
    //3、在controller层所做的操作会不会直接影响到数据库里面的数据呢？
    //4、不太懂为什么controller里面的函数返回值类型都是JSonResult类型，也看不太懂
    //  JSonResult里面的一些函数，如add（Object data），setMsg（）
    //5、将address表的地址字段fullAddress加进JsonResult中时，用add（）方法还是setMsg（）方法？

    //切换到 常用收货地址
    @RequestMapping("/switchCommonAddress")
    public JsonResult switchCommonAddress(Integer targetId){
        JsonResult js = new JsonResult();
        if(iAService.getById(targetId).getIsCommonAddress()==1){
            iAService.getById(targetId).setIsCommonAddress(0);
            js.setMsg(iAService.getById(targetId).getFullAddress());
        }
        return js;
    }



}

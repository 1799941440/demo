package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.entity.Address;
import com.example.demo.service.IAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
    // 1、判断传进来的address的isCommonAddress是不是1
    // 2、不是就直接加入，是就取出常用的设为0保存
    //3、再把传进来的address保存。
    @RequestMapping("/addAddress")
    public JsonResult addAddress(Address address){
        JsonResult js = new JsonResult();
        Address addA;//存放address对应的user的常用收货地址对象
        if(address.getIsCommonAddress() == 0){//要添加的地址不是常用
            if (iAService.add(address) == 1) {
                js.setMsg("添加收货地址成功");
            }else{
                js.setMsg("添加收货地址失败");
            }
        }else {//要添加的地址常用
            addA = iAService.getCommonAddress(address.getUserId());
            addA.setIsCommonAddress(0);
            //iAService.add(address)--将传入的address设为常用收货地址
            if(iAService.update(addA) == 1&&iAService.add(address) == 1){
                js.setMsg("添加收货地址成功");
            }else {
                js.setErrMsg("添加收货地址失败");
            }
        }
        return js;
    }

    //查询用户的 常用收货地址 返回一个address对象
    @RequestMapping("/getCommonAddress")
    public JsonResult getCommonAddress(Integer userId){
        JsonResult js = new JsonResult();
        js.add(iAService.getCommonAddress(userId));
        if(js.getPageSize() == 0){
            js.setErrMsg("获取失败");
        }else{
            js.setMsg("获取成功");
        }
        return js;
    }

    //切换到 常用收货地址
    // 1、取出要设为常用地址的那条记录
    // 2、取出该用户所有的地址
    // 3、将要设为常用地址的isCommonAddress设为1并保存
    // 4、将用户的其他地址isCommonAddress设为0并保存
    @RequestMapping("/switchCommonAddress")
    public JsonResult switchCommonAddress(Integer targetId){
        JsonResult js = new JsonResult();
        Address switchA = iAService.getById(targetId);
        List<Address> list = iAService.getForUser(switchA.getUserId());
        if(switchAddress(list)){
            js.setMsg("切换成功");
        }else{
            js.setErrMsg("切换失败");
        }
        return js;
    }

    public boolean switchAddress(List<Address> list){
        for (Address address :list){
            address.setIsCommonAddress(0);
            if (iAService.update(address) == 0) {
                return false;
            }
        }
        return true;
    }
    //问题：
    //1、switchCommonAddress中，targetId是用户表的id 还是address表的id？ ->是address表的id
    //2、为什么在entity中每个表自身的id没有呢？ ->在BaseEntity表中，entity继承BaseEntity
    //3、在controller层所做的操作会不会直接影响到数据库里面的数据呢？
    //      ->如果用到了IxxxService中的方法，操作会改变数据库中的数据
    //4、不太懂为什么controller里面的函数返回值类型都是JSonResult类型，也看不太懂
    //  JSonResult里面的一些函数，如add（Object data），setMsg（）
    //      ->JSonResult类型很方便的.
    //5、将address表的地址字段fullAddress加进JsonResult中时，用add（）方法还是setMsg（）方法？
    //      ->setMsg（）是给前台发送提示信息的，如“添加成功”。
    //      ->另外，要有{对象}的思想，切记！切记！切记！

}

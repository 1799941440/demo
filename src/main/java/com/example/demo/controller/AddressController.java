package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.service.IAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/AddressAction")
public class AddressController {

    @Resource
    private IAddressService iAService;

    @RequestMapping("/getForUser")
    public JsonResult getForUser(Integer userId){
        JsonResult js = new JsonResult();
        js.add(iAService.getForUser(userId));
        js.setTotal(iAService.getCountForUser(userId));
        return js;
    }

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
}

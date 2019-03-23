package com.example.demo.controller;

import com.example.demo.base.JsonResult;
import com.example.demo.entity.vo.GoodsInfo;
import com.example.demo.entity.vo.ServerInfo;
import com.example.demo.queryparam.ServerQuery;
import com.example.demo.service.IGoodsService;
import com.example.demo.service.IServerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/23 18:59
 * @description
 **/

@RestController
@RequestMapping("/ServerAction")
public class ServerController{

    @Resource
    private IServerService iSServer;
    @Resource
    private IGoodsService iGServer;

    @RequestMapping("getForUser")
    public JsonResult getForUser(ServerQuery sq) {
        JsonResult js = new JsonResult();
        List<ServerInfo> respo = new ArrayList<>();
        respo.addAll(iSServer.getForUser(sq));
        setGoodsForServer(respo);
        js.add(respo);
        js.setTotal(iSServer.getCountForUser(sq));
        if (js.getPageSize() == 0) {
            js.setMsg("没有数据");
        } else{
            js.setMsg("获取服务成功");
        }
        return js;
    }

    public void setGoodsForServer(List<ServerInfo> list) {
        for (int i = 0; i < list.size(); i++) {
            String goods = list.get(i).getGoodsId();
            String[] split = goods.substring(1, goods.length() - 1).split(",");
            List<GoodsInfo> goodsList = new ArrayList<>();
            for (int j = 0; j<split.length;j++) {
                goodsList.add(iGServer.getById(Integer.valueOf(split[i])));
            }
            list.get(i).setGoodsList(goodsList);
        }
    }
}

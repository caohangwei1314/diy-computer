package com.example.demo.user.controller;

import com.example.demo.user.model.Collect;
import com.example.demo.product.model.Products;
import com.example.demo.user.service.CollectService;
import com.example.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("users/collect")
public class CollectController extends BaseController {

    @Autowired
    private CollectService collectService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody Collect collect, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        if(collectService.selectByUidAndCid(userId,collect.getCommodityId())!=null)
        {
            msg.put("code","0");
            msg.put("msg","已插入");
        }else{
            collect.setUserId(userId);
            if(collectService.insert(collect)>0)
            {
                msg.put("code","1");
                msg.put("msg","成功");
            }else{
                msg.put("code","0");
                msg.put("msg","失败");
            }
        }
        return msg;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public Map<String,Object> select(HttpServletRequest request)
//    {
//        msg.clear();
//        Long userId=Long.parseLong(request.getAttribute("userId").toString());
//        List<Products> collect = collectService.selectDetail(userId);
//        if(collect!=null)
//        {
//            msg.put("code",1);
//            msg.put("msg","成功");
//            msg.put("data",collect);
//        }else{
//            msg.put("code",0);
//            msg.put("msg","失败");
//        }
//        return msg;
//    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody Collect collect)
    {
        msg.clear();
        if(collectService.update(collect)>0)
        {
            msg.put("code",1);
            msg.put("msg","成功");
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public Map<String,Object> delete(@RequestParam("id") Long cId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        Collect collect = collectService.select(userId,cId);
        if(collect.getUserId().equals(userId))
        {
            if(collectService.delete(userId,cId)>0)
            {
                msg.put("code",1);
                msg.put("msg","成功");
            }else{
                msg.put("code",0);
                msg.put("msg","失败");
            }
        }else{
            msg.put("code",0);
            msg.put("msg","你没有权限");
        }
        return msg;
    }
    @RequestMapping(value = "/iscollect",method = RequestMethod.GET)
    public Map<String,Object> isCollect(@RequestParam("id") Long cId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
            if(collectService.select(userId,cId)!=null)
            {
                msg.put("code",1);
                msg.put("msg","成功");
            }else{
                msg.put("code",0);
                msg.put("msg","失败");
            }
        return msg;
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> select(@RequestBody Map<String,Object> conditions,HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        Integer limit = Integer.parseInt(conditions.get("limit").toString());
        Integer page = Integer.parseInt(conditions.get("page").toString());;

        PageBean pageBean = collectService.selectPage(limit,page,userId);
        if(pageBean!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",pageBean);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }
}

package com.example.demo.product.controller;

import com.example.demo.product.model.Diy;
import com.example.demo.product.service.DiyService;
import com.example.demo.user.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("products/diy")
public class DiyController extends BaseController {
    @Autowired
    private DiyService diyService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody Diy diy, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        diy.setUserId(userId);
        if(diyService.insert(diy)>0)
        {
            msg.put("code",1);
            msg.put("msg","成功");
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Map<String,Object> select(@RequestParam("id") Long diyId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        Map<String,Object> diy = diyService.select(diyId);
        if(diy!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",diy);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody Diy diy)
    {
        msg.clear();
        if(diyService.update(diy)>0)
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
    public Map<String,Object> delete(@RequestParam("id") Long diyId, HttpServletRequest request)
    {
        msg.clear();
        if (diyService.delete(diyId) > 0) {
            msg.put("code", 1);
            msg.put("msg", "成功");
        } else {
            msg.put("code", 0);
            msg.put("msg", "失败");
        }
        return msg;
    }
}

package com.example.demo.product.controller;

import com.example.demo.product.model.HeatSink;
import com.example.demo.product.service.HeatSinkService;
import com.example.demo.user.controller.BaseController;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("products/sink")
public class HeatSinkController extends BaseController {
    @Autowired
    private HeatSinkService heatSinkService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody HeatSink heatSink, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        heatSink.setUserId(userId);
        if(heatSink.getImage()!=""&&heatSink.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(heatSink.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                heatSink.setImage(fileName);
            }
        }
        if(heatSinkService.insert(heatSink)>0)
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
    public Map<String,Object> select(@RequestParam("id") Long heatSinkId)
    {
        msg.clear();
        HeatSink heatSink = heatSinkService.select(heatSinkId);
        if(heatSink!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",heatSink);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody HeatSink heatSink)
    {
        msg.clear();
        if(heatSink.getImage()!=""&&heatSink.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(heatSink.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                heatSink.setImage(fileName);
            }
        }
        if(heatSinkService.update(heatSink)>0)
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
    public Map<String,Object> delete(@RequestParam("id") Long heatSinkId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        HeatSink heatSink = heatSinkService.select(heatSinkId);
        if(heatSink.getUserId().equals(userId))
        {
            if(heatSinkService.delete(heatSinkId)>0)
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
}

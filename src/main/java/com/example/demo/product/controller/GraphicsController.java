package com.example.demo.product.controller;

import com.example.demo.product.model.Graphics;
import com.example.demo.product.service.GraphicsService;
import com.example.demo.user.controller.BaseController;
import com.example.demo.utils.UploadUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("products/graphics")
public class GraphicsController extends BaseController {
    @Autowired
    private GraphicsService graphicsService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody Graphics graphics, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        graphics.setUserId(userId);
        if(graphics.getImage()!=""&&graphics.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(graphics.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                graphics.setImage(fileName);
            }
        }
        if(graphicsService.insert(graphics)>0)
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
    public Map<String,Object> select(@RequestParam("id") Long graphicsId)
    {
        msg.clear();
        Graphics chassis = graphicsService.select(graphicsId);
        if(chassis!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",chassis);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody Graphics graphics)
    {
        msg.clear();
        if(graphics.getImage()!=""&&graphics.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(graphics.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                graphics.setImage(fileName);
            }
        }
        if(graphicsService.update(graphics)>0)
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
    public Map<String,Object> delete(@RequestParam("id") Long graphicsId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        Graphics chassis = graphicsService.select(graphicsId);
        if(chassis.getUserId().equals(userId))
        {
            if(graphicsService.delete(graphicsId)>0)
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

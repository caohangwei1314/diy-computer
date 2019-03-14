package com.example.demo.product.controller;

import com.example.demo.product.model.Ssd;
import com.example.demo.product.service.SsdService;
import com.example.demo.user.controller.BaseController;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("products/ssd")
public class SsdController extends BaseController {
    @Autowired
    private SsdService ssdService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody Ssd ssd, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        ssd.setUserId(userId);
        if(ssd.getImage()!=""&&ssd.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(ssd.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                ssd.setImage(fileName);
            }
        }
        if(ssdService.insert(ssd)>0)
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
    public Map<String,Object> select(@RequestParam("id") Long ssdId)
    {
        msg.clear();
        Ssd chassis = ssdService.select(ssdId);
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
    public Map<String,Object> update(@RequestBody Ssd ssd)
    {
        msg.clear();
        if(ssd.getImage()!=""&&ssd.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(ssd.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                ssd.setImage(fileName);
            }
        }
        if(ssdService.update(ssd)>0)
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
    public Map<String,Object> delete(@RequestParam("id") Long ssdId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        Ssd chassis = ssdService.select(ssdId);
        if(chassis.getUserId().equals(userId))
        {
            if(ssdService.delete(ssdId)>0)
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

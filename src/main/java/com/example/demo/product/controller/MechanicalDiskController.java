package com.example.demo.product.controller;

import com.example.demo.product.model.MechanicalDisk;
import com.example.demo.product.service.MechanicalDiskService;
import com.example.demo.user.controller.BaseController;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("products/mechanical")
public class MechanicalDiskController extends BaseController {
    @Autowired
    private MechanicalDiskService mechanicalDiskService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody MechanicalDisk mechanicalDisk, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        mechanicalDisk.setUserId(userId);
        if(mechanicalDisk.getImage()!=""&&mechanicalDisk.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(mechanicalDisk.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                mechanicalDisk.setImage(fileName);
            }
        }
        if(mechanicalDiskService.insert(mechanicalDisk)>0)
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
    public Map<String,Object> select(@RequestParam("id") Long mechanicalDiskId)
    {
        msg.clear();
        MechanicalDisk mechanicalDisk = mechanicalDiskService.select(mechanicalDiskId);
        if(mechanicalDisk!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",mechanicalDisk);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody MechanicalDisk mechanicalDisk)
    {
        msg.clear();
        if(mechanicalDisk.getImage()!=""&&mechanicalDisk.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(mechanicalDisk.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                mechanicalDisk.setImage(fileName);
            }
        }
        if(mechanicalDiskService.update(mechanicalDisk)>0)
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
    public Map<String,Object> delete(@RequestParam("id") Long mechanicalDiskId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        MechanicalDisk mechanicalDisk = mechanicalDiskService.select(mechanicalDiskId);
        if(mechanicalDisk.getUserId().equals(userId))
        {
            if(mechanicalDiskService.delete(mechanicalDiskId)>0)
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

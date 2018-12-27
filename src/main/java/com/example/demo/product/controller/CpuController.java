package com.example.demo.product.controller;

import com.example.demo.product.model.Cpu;
import com.example.demo.product.service.CpuService;
import com.example.demo.user.controller.BaseController;
import com.example.demo.utils.UploadUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("products/cpu")
public class CpuController extends BaseController {
    @Autowired
    private CpuService cpuService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody Cpu cpu, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        cpu.setUserId(userId);
        if(cpu.getImage()!=""&&cpu.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(cpu.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                cpu.setImage(fileName);
            }
        }
        if(cpuService.insert(cpu)>0)
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
    public Map<String,Object> select(@RequestParam("id") Long cpuId)
    {
        msg.clear();
        Cpu cpu = cpuService.select(cpuId);
        if(cpu!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",cpu);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody Cpu cpu)
    {
        msg.clear();
        if(cpu.getImage()!=""&&cpu.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(cpu.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                cpu.setImage(fileName);
            }
        }
        if(cpuService.update(cpu)>0)
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
    public Map<String,Object> delete(@RequestParam("id") Long cpuId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        Cpu chassis = cpuService.select(cpuId);
        if(chassis.getUserId().equals(userId))
        {
            if(cpuService.delete(cpuId)>0)
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

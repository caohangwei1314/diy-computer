package com.example.demo.product.controller;

import com.example.demo.product.model.Chassis;
import com.example.demo.product.model.Products;
import com.example.demo.product.service.ChassisService;
import com.example.demo.product.service.EvaluationService;
import com.example.demo.product.service.ProductsService;
import com.example.demo.user.controller.BaseController;
import com.example.demo.utils.UploadUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("products/chassis")
public class ChassisController extends BaseController {

    @Autowired
    private ChassisService chassisService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody Chassis chassis, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        chassis.setUserId(userId);
        if(chassis.getImage()!=""&&chassis.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(chassis.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                chassis.setImage(fileName);
            }
        }
        if(chassisService.insert(chassis)>0)
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
    public Map<String,Object> select(@RequestParam("id") Long chassisId)
    {
        msg.clear();
        Chassis chassis = chassisService.select(chassisId);
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
    public Map<String,Object> update(@RequestBody Chassis chassis)
    {
        msg.clear();
        if(chassis.getImage()!=""&&chassis.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(chassis.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                chassis.setImage(fileName);
            }
        }
        if(chassisService.update(chassis)>0)
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
    public Map<String,Object> delete(@RequestParam("id") Long chassisId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        Chassis chassis = chassisService.select(chassisId);
        if(chassis.getUserId().equals(userId))
        {
            if(chassisService.delete(chassisId)>0)
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

//    @RequestMapping(method = RequestMethod.GET)
//    public Map<String,Object> selectEvaluation(@RequestParam("id") Long chassisId)
//    {
//        msg.clear();
//        Chassis chassis = chassisService.selectEvaluation(chassisId);
//        if(chassis!=null)
//        {
//            msg.put("code",1);
//            msg.put("msg","成功");
//            msg.put("data",chassis);
//        }else{
//            msg.put("code",0);
//            msg.put("msg","失败");
//        }
//        return msg;
//    }
}

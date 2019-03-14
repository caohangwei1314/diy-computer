package com.example.demo.product.controller;

import com.example.demo.product.model.Motherboard;
import com.example.demo.product.service.MotherBoardService;
import com.example.demo.user.controller.BaseController;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("products/board")
public class MotherBoardController extends BaseController {
    @Autowired
    private MotherBoardService motherBoardService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody Motherboard motherBoard, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        motherBoard.setUserId(userId);
        if(motherBoard.getImage()!=""&&motherBoard.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(motherBoard.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                motherBoard.setImage(fileName);
            }
        }
        if(motherBoardService.insert(motherBoard)>0)
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
    public Map<String,Object> select(@RequestParam("id") Long motherboardId)
    {
        msg.clear();
        Motherboard motherboard = motherBoardService.select(motherboardId);
        if(motherboard!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",motherboard);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody Motherboard motherboard)
    {
        msg.clear();
        if(motherboard.getImage()!=""&&motherboard.getImage()!=null)
        {
            UploadUtil uploadUtil=new UploadUtil();
            String fileName=uploadUtil.upload(motherboard.getImage());
            if(fileName==null)
            {
                msg.put("code",0);
                msg.put("msg","图片上传失败");
                return msg;
            }else{
                motherboard.setImage(fileName);
            }
        }
        if(motherBoardService.update(motherboard)>0)
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
    public Map<String,Object> delete(@RequestParam("id") Long motherboardId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        Motherboard motherboard = motherBoardService.select(motherboardId);
        if(motherboard.getUserId().equals(userId))
        {
            if(motherBoardService.delete(motherboardId)>0)
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

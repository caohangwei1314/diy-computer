package com.example.demo.user.controller;

import com.example.demo.user.model.Address;
import com.example.demo.user.service.AddressService;
import com.example.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("users/address")
public class AddressController extends BaseController{
    @Autowired
    private AddressService addressService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody Address address,HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        address.setUserId(userId);
        if(addressService.insert(address)>0)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",address);
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

        PageBean address = addressService.select(limit,page,userId);
        if(address!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",address);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody Address address)
    {
        msg.clear();
        if(addressService.update(address)>0)
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
    public Map<String,Object> delete(@RequestParam("id") Long id, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        if (addressService.delete(id, userId) > 0) {
            msg.put("code", "1");
            msg.put("msg", "成功");
        } else {
            msg.put("code", "0");
            msg.put("msg", "失败");
        }
        return msg;
    }
}

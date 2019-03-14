package com.example.demo.user.controller;

import com.example.demo.user.model.Orders;
import com.example.demo.user.service.OrderService;
import com.example.demo.user.service.UsersService;
import com.example.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("users/order")
public class OrderController extends BaseController{
    @Autowired
    private OrderService orderService;

    @Autowired
    private UsersService usersService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody Orders orders, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        if(usersService.updateMoney(orders.getTotal(),userId)>0)
        {
            orders.setUserId(userId);
            if(orderService.insert(orders)>0)
            {
                msg.put("code",1);
                msg.put("msg","成功");
            }else{
                msg.put("code",0);
                msg.put("msg","失败");
            }
            return msg;
        }else{
            msg.put("code","0");
            msg.put("msg","余额不足");
            return msg;
        }
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> select(@RequestBody Map<String,Object> conditions,HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        Integer limit = Integer.parseInt(conditions.get("limit").toString());
        Integer page = Integer.parseInt(conditions.get("page").toString());;

        PageBean order = orderService.select(limit,page,userId);
        if(order!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",order);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(value = "/detail",method = RequestMethod.POST)
    public Map<String,Object> selectDetail(@RequestBody Map<String,Object> conditions)
    {
        msg.clear();
        Long orderId = Long.parseLong(conditions.get("orderId").toString());
        Integer limit = Integer.parseInt(conditions.get("limit").toString());
        Integer page = Integer.parseInt(conditions.get("page").toString());;

        PageBean orderDetail = orderService.selectDetail(limit,page,orderId);
        if(orderDetail!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",orderDetail);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody Orders orders)
    {
        msg.clear();
        if(orderService.update(orders)>0)
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
        if (orderService.delete(id, userId) > 0) {
            msg.put("code", "1");
            msg.put("msg", "成功");
        } else {
            msg.put("code", "0");
            msg.put("msg", "失败");
        }
        return msg;
    }
}

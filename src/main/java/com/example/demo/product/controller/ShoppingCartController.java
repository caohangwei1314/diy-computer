package com.example.demo.product.controller;

import com.example.demo.product.model.Products;
import com.example.demo.product.model.ShoppingCart;
import com.example.demo.product.service.ShoppingCartService;
import com.example.demo.user.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("users/shoppingcart")
public class ShoppingCartController extends BaseController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody ShoppingCart shoppingCart, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        ShoppingCart shoppingCarted = shoppingCartService.selectByUidAndCid(userId,shoppingCart.getCommodityId());
        if(shoppingCarted!=null)
        {
            shoppingCarted.setNumber(shoppingCarted.getNumber()+1l);
            if(shoppingCartService.update(shoppingCarted)>0)
            {
                msg.put("code",1);
                msg.put("msg","成功");
            }else{
                msg.put("code",0);
                msg.put("msg","失败");
            }
        }else{
            shoppingCart.setUserId(userId);
            if(shoppingCartService.insert(shoppingCart)>0)
            {
                msg.put("code",1);
                msg.put("msg","成功");
            }else{
                msg.put("code",0);
                msg.put("msg","失败");
            }
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Map<String,Object> select(HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        List<Products> shoppingCart = shoppingCartService.selectDetail(userId);
        if(shoppingCart!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",shoppingCart);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody ShoppingCart shoppingCart)
    {
        msg.clear();
        if(shoppingCartService.update(shoppingCart)>0)
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
    public Map<String,Object> delete(@RequestParam("id") Long cId, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        ShoppingCart shoppingCart = shoppingCartService.select(userId,cId);
        if(shoppingCart.getUserId().equals(userId))
        {
            if(shoppingCartService.delete(userId,cId)>0)
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

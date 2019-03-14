package com.example.demo.user.service.impl;

import com.example.demo.user.mapper.ShoppingCartMapper;
import com.example.demo.product.model.Products;
import com.example.demo.user.model.ShoppingCart;
import com.example.demo.user.model.ShoppingCartExample;
import com.example.demo.user.service.ShoppingCartService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShoppingCartImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public int insert(ShoppingCart shoppingCart)
    {
        Date date = new Date();
        shoppingCart.setGmtCreate(date);
        shoppingCart.setGmtModified(date);
        return shoppingCartMapper.insertSelective(shoppingCart);
    }

    @Override
    public ShoppingCart select(Long userId,Long cId)
    {
        return shoppingCartMapper.selectByUidAndCid(userId,cId);
    }

    @Override
    public ShoppingCart selectByUidAndCid(Long userId,Long cId)
    {
        return shoppingCartMapper.selectByUidAndCid(userId,cId);
    }

    @Override
    public int update(ShoppingCart shoppingCart)
    {
        Date date = new Date();
        shoppingCart.setGmtModified(date);
        ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
        ShoppingCartExample.Criteria criteria = shoppingCartExample.createCriteria();
        criteria.andCommodityIdEqualTo(shoppingCart.getCommodityId());
        return shoppingCartMapper.updateByExampleSelective(shoppingCart,shoppingCartExample);
    }

    @Override
    public int delete(Long userId,Long cId)
    {
        ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
        ShoppingCartExample.Criteria criteria = shoppingCartExample.createCriteria();
        criteria.andCommodityIdEqualTo(cId);
        criteria.andUserIdEqualTo(userId);
       return shoppingCartMapper.deleteByExample(shoppingCartExample);
    }

    @Override
    public List<Products> selectDetail(Long userId)
    {
        List<Products> productsList =shoppingCartMapper.selectDetail(userId);
        UploadUtil uploadUtil = new UploadUtil();
        for(Products products:productsList)
        {
            products.setImage(uploadUtil.toBase64(products.getImage()));
        }
        return productsList;
    }

    @Override
    public long countByUserId(Long userId)
    {
        ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
        ShoppingCartExample.Criteria criteria = shoppingCartExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return shoppingCartMapper.countByExample(shoppingCartExample);
    }
}

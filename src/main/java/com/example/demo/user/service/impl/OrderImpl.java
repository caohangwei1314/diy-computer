package com.example.demo.user.service.impl;

import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.model.Products;
import com.example.demo.user.mapper.ShoppingCartMapper;
import com.example.demo.user.model.*;
import com.example.demo.user.mapper.OrderDetailMapper;
import com.example.demo.user.mapper.OrdersMapper;
import com.example.demo.user.service.OrderService;
import com.example.demo.utils.PageBean;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderImpl implements OrderService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public int insert(Orders orders)
    {
        Date date = new Date();
        orders.setGmtCreate(date);
        orders.setGmtModified(date);
        orders.setPaymentTime(date);
        if(ordersMapper.insertSelective(orders)>0)
        {
            List<OrderDetail> orderDetailList = new ArrayList<>();
            for(ShoppingCart shoppingCart:orders.getShoppingCart()){
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setOrderId(orders.getPkId());
                orderDetail.setProductId(shoppingCart.getCommodityId());
                orderDetail.setNumber(shoppingCart.getNumber());
                orderDetail.setTotal(shoppingCart.getTotal());
                orderDetail.setGmtCreate(date);
                orderDetail.setGmtModified(date);
                orderDetailList.add(orderDetail);
            }
            orderDetailMapper.insertBatch(orderDetailList);
            for(ShoppingCart shoppingCart:orders.getShoppingCart()){
                shoppingCartMapper.deleteByPrimaryKey(shoppingCart.getPkId());
            }
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public PageBean select(Integer limit, Integer page, Long userId)
    {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        int count = (int) ordersMapper.countByExample(ordersExample);
        if(count>0){
            PageBean pageBean = new PageBean(page,count,limit);
            List<Orders> orderList=ordersMapper.selectByExample(ordersExample);
            pageBean.setList(orderList);
            return pageBean;
        }else{
            return null;
        }
    }

    @Override
    public int update(Orders orders)
    {
        return ordersMapper.updateByPrimaryKeySelective(orders);
    }

    @Override
    public int delete(Long id,Long userId)
    {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andPkIdEqualTo(id);
        return ordersMapper.deleteByExample(ordersExample);
    }

    @Override
    public PageBean selectDetail(Integer limit, Integer page, Long orderId)
    {
        OrderDetailExample orderDetailExample = new OrderDetailExample();
        OrderDetailExample.Criteria criteria = orderDetailExample.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        int count = (int) orderDetailMapper.countByExample(orderDetailExample);
        if(count>0){
            PageBean pageBean = new PageBean(page,count,limit);
            List<OrderDetail> orderDetailList=orderDetailMapper.selectByExample(orderDetailExample);
            List<Products> productsList = new ArrayList<>();
            for(OrderDetail orderDetail:orderDetailList)
            {
                UploadUtil uploadUtil = new UploadUtil();
                Products products = productsMapper.selectByPrimaryKey(orderDetail.getProductId());
                products.setImage(uploadUtil.toBase64(products.getImage()));
                productsList.add(products);
            }
            pageBean.setList(productsList);
            return pageBean;
        }else{
            return null;
        }
    }
}

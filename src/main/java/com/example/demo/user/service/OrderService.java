package com.example.demo.user.service;

import com.example.demo.user.model.Orders;
import com.example.demo.utils.PageBean;

public interface OrderService {
    int insert(Orders orders);

    PageBean select(Integer limit, Integer page, Long userId);

    int update(Orders orders);

    int delete(Long id,Long userId);

    PageBean selectDetail(Integer limit, Integer page, Long orderId);
}
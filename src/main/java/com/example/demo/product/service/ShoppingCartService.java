package com.example.demo.product.service;

import com.example.demo.product.model.Products;
import com.example.demo.product.model.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {
    int insert(ShoppingCart shoppingCart);

    ShoppingCart select(Long userId,Long cId);

    int update(ShoppingCart shoppingCart);

    int delete(Long userId,Long cId);

    List<Products> selectDetail(Long userId);

    ShoppingCart selectByUidAndCid(Long userId,Long cId);

    long countByUserId(Long userId);
}

package com.example.demo.product.service;

import com.example.demo.product.model.Collect;
import com.example.demo.product.model.Products;

import java.util.List;

public interface CollectService {
    int insert(Collect collect);

    Collect select(Long userId,Long cId);

    int update(Collect collect);

    int delete(Long userId,Long cId);

    List<Products> selectDetail(Long userId);

    Collect selectByUidAndCid(Long userId,Long cId);

    long countByUserId(Long userId);
}

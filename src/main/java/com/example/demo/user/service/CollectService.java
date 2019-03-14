package com.example.demo.user.service;

import com.example.demo.user.model.Collect;
import com.example.demo.product.model.Products;
import com.example.demo.utils.PageBean;

import java.util.List;

public interface CollectService {
    int insert(Collect collect);

    Collect select(Long userId,Long cId);

    int update(Collect collect);

    int delete(Long userId,Long cId);

//    List<Products> selectDetail(Long userId);

    Collect selectByUidAndCid(Long userId,Long cId);

    long countByUserId(Long userId);

    PageBean selectPage(Integer limit,Integer page,Long userId);
}

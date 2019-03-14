package com.example.demo.product.service;

import com.example.demo.product.model.Diy;

import java.util.Map;

public interface DiyService {
    int insert(Diy diy);

    Map<String,Object> select(Long diyId);

    int update(Diy diy);

    int delete(Long diyId);
}

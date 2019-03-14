package com.example.demo.product.service;

import com.example.demo.product.model.Power;

public interface PowerService {
    int insert(Power power);

    Power select(Long powerId);

    int update(Power power);

    int delete(Long powerId);
}

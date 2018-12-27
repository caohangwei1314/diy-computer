package com.example.demo.product.service;

import com.example.demo.product.model.HeatSink;

public interface HeatSinkService {
    int insert(HeatSink heatSink);

    HeatSink select(Long heatSinkId);

    int update(HeatSink heatSink);

    int delete(Long heatSinkId);
}

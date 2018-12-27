package com.example.demo.product.service;

import com.example.demo.product.model.Monitor;

public interface MonitorService {
    int insert(Monitor monitor);

    Monitor select(Long monitorId);

    int update(Monitor monitor);

    int delete(Long monitorId);
}

package com.example.demo.product.service;

import com.example.demo.product.model.Ssd;

public interface SsdService {
    int insert(Ssd ssd);

    Ssd select(Long ssdId);

    int update(Ssd ssd);

    int delete(Long ssdId);
}

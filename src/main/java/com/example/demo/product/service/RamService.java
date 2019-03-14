package com.example.demo.product.service;

import com.example.demo.product.model.Ram;

public interface RamService {
    int insert(Ram ram);

    Ram select(Long ramId);

    int update(Ram ram);

    int delete(Long ramId);
}

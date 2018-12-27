package com.example.demo.product.service;

import com.example.demo.product.model.Motherboard;

public interface MotherBoardService {
    int insert(Motherboard motherboard);

    Motherboard select(Long motherboardId);

    int update(Motherboard motherboard);

    int delete(Long motherboardId);
}

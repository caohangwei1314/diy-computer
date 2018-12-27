package com.example.demo.product.service;

import com.example.demo.product.model.Graphics;

public interface GraphicsService {
    int insert(Graphics chassis);

    Graphics select(Long graphicsId);

    int update(Graphics graphics);

    int delete(Long graphicsId);
}

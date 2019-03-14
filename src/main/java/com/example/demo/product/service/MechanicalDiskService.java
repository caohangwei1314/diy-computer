package com.example.demo.product.service;

import com.example.demo.product.model.MechanicalDisk;

public interface MechanicalDiskService {
    int insert(MechanicalDisk mechanicalDisk);

    MechanicalDisk select(Long mechanicalDiskId);

    int update(MechanicalDisk mechanicalDisk);

    int delete(Long mechanicalDiskId);
}

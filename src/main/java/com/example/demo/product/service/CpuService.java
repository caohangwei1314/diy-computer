package com.example.demo.product.service;
import com.example.demo.product.model.Cpu;

public interface CpuService {

    int insert(Cpu cpu);

    Cpu select(Long cpuId);

    int update(Cpu cpu);

    int delete(Long cpuId);

}

package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.*;
import com.example.demo.product.model.Diy;
import com.example.demo.product.service.DiyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class DiyImpl implements DiyService {
    @Autowired
    private DiyMapper diyMapper;

    @Autowired
    private ChassisMapper chassisMapper;

    @Autowired
    private CpuMapper cpuMapper;

    @Autowired
    private GraphicsMapper graphicsMapper;

    @Autowired
    private HeatSinkMapper heatSinkMapper;

    @Autowired
    private MechanicalDiskMapper mechanicalDiskMapper;

    @Autowired
    private MonitorMapper monitorMapper;

    @Autowired
    private MotherboardMapper motherboardMapper;

    @Autowired
    private PowerMapper powerMapper;

    @Autowired
    private RamMapper ramMapper;

    @Autowired
    private SsdMapper ssdMapper;

    @Override
    public int insert(Diy diy)
    {
        Date date = new Date();
        diy.setGmtCreate(date);
        diy.setGmtModified(date);
        return diyMapper.insertSelective(diy);
    }

    @Override
    public Map<String,Object> select(Long diyId)
    {
        Diy diy = diyMapper.selectByPrimaryKey(diyId);
        Map<String,Object> data = new HashMap<>(0);
        data.put("chassis",chassisMapper.selectByPrimaryKey(diy.getChassis()));
        data.put("cpu",cpuMapper.selectByPrimaryKey(diy.getCpu()));
        data.put("graphics",graphicsMapper.selectByPrimaryKey(diy.getGraphics()));
        data.put("heatSink",heatSinkMapper.selectByPrimaryKey(diy.getHeakSink()));
        data.put("mechanicalDisk",mechanicalDiskMapper.selectByPrimaryKey(diy.getDisk()));
        data.put("monitor",monitorMapper.selectByPrimaryKey(diy.getMonitor()));
        data.put("motherboard",motherboardMapper.selectByPrimaryKey(diy.getBoard()));
        data.put("power",powerMapper.selectByPrimaryKey(diy.getPower()));
        data.put("ram",ramMapper.selectByPrimaryKey(diy.getRam()));
        data.put("ssd",ssdMapper.selectByPrimaryKey(diy.getSsd()));
        return data;
    }

    @Override
    public int update(Diy diy)
    {
        diy.setGmtModified(new Date());
        return diyMapper.updateByPrimaryKeySelective(diy);
    }

    @Override
    public int delete(Long diyId)
    {
        return diyMapper.deleteByPrimaryKey(diyId);
    }
}

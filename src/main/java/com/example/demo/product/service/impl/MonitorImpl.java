package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.MonitorMapper;
import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.model.Monitor;
import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import com.example.demo.product.service.MonitorService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class MonitorImpl implements MonitorService {
    @Autowired
    private MonitorMapper monitorMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int insert(Monitor monitor)
    {
        Date date = new Date();
        monitor.setGmtCreate(date);
        monitor.setGmtModified(date);
        monitor.setClassId(6l);
        monitorMapper.insertSelective(monitor);
        Products products = new Products();
        products.setProductId(monitor.getPkId());
        products.setClassId(6l);
        products.setName(monitor.getName());
        products.setPrice(monitor.getPrice());
        products.setImage(monitor.getImage());
        products.setSalesNumber(0l);
        products.setScore(monitor.getScore());
        products.setPoints(new BigDecimal(0));
        products.setGmtCreate(date);
        products.setGmtModified(date);
        return productsMapper.insert(products);
    }

    @Override
    public Monitor select(Long monitorId)
    {
        Monitor monitor = monitorMapper.selectByPrimaryKey(monitorId);
        if(monitor.getImage()!=null&&!monitor.getImage().equals(""))
        {
            UploadUtil uploadUtil = new UploadUtil();
            monitor.setImage(uploadUtil.toBase64(monitor.getImage()));
        }
        return monitor;
    }

    @Override
    public int update(Monitor monitor)
    {
        Date date = new Date();
        monitor.setGmtModified(date);
        monitorMapper.updateByPrimaryKeySelective(monitor);
        Products products = new Products();
        products.setName(monitor.getName());
        products.setPrice(monitor.getPrice());
        products.setImage(monitor.getImage());
        products.setGmtModified(date);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(monitor.getPkId());
        criteria.andClassIdEqualTo(6l);
        return productsMapper.updateByExampleSelective(products,productsExample);
    }

    @Override
    public int delete(Long monitorId)
    {
        monitorMapper.deleteByPrimaryKey(monitorId);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(monitorId);
        return productsMapper.deleteByExample(productsExample);
    }
}

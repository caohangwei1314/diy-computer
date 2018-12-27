package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.ChassisMapper;
import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.model.*;
import com.example.demo.product.service.ChassisService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class ChassisImpl implements ChassisService {

    @Autowired
    private ChassisMapper chassisMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int insert(Chassis chassis)
    {
        Date date = new Date();
        chassis.setGmtCreate(date);
        chassis.setGmtModified(date);
        chassis.setClassId(1l);
        chassisMapper.insertSelective(chassis);
        Products products = new Products();
        products.setProductId(chassis.getPkId());
        products.setClassId(1l);
        products.setName(chassis.getName());
        products.setPrice(chassis.getPrice());
        products.setImage(chassis.getImage());
        products.setScore(chassis.getScore());
        products.setPoints(new BigDecimal(0));
        products.setSalesNumber(0l);
        products.setGmtCreate(date);
        products.setGmtModified(date);
        return productsMapper.insert(products);
    }

    @Override
    public Chassis select(Long chassisId)
    {
        Chassis chassis = chassisMapper.selectByPrimaryKey(chassisId);
        if(chassis.getImage()!=null&&!chassis.getImage().equals(""))
        {
            UploadUtil uploadUtil = new UploadUtil();
            chassis.setImage(uploadUtil.toBase64(chassis.getImage()));
        }
        return chassis;
    }

    @Override
    public int update(Chassis chassis)
    {
        Date date = new Date();
        chassis.setGmtModified(date);
        chassisMapper.updateByPrimaryKeySelective(chassis);
        Products products = new Products();
        products.setName(chassis.getName());
        products.setPrice(chassis.getPrice());
        products.setImage(chassis.getImage());
        products.setGmtModified(date);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(chassis.getPkId());
        criteria.andClassIdEqualTo(1l);
        return productsMapper.updateByExampleSelective(products,productsExample);
    }

    @Override
    public int delete(Long chassisId)
    {
        chassisMapper.deleteByPrimaryKey(chassisId);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(chassisId);
        return productsMapper.deleteByExample(productsExample);
    }
}

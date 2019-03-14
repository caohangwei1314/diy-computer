package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.PowerMapper;
import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.model.Power;
import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import com.example.demo.product.service.PowerService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class PowerImpl implements PowerService {
    @Autowired
    private PowerMapper powerMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int insert(Power power)
    {
        Date date = new Date();
        power.setGmtCreate(date);
        power.setGmtModified(date);
        power.setClassId(8l);
        powerMapper.insertSelective(power);
        Products products = new Products();
        products.setProductId(power.getPkId());
        products.setClassId(8l);
        products.setName(power.getName());
        products.setPrice(power.getPrice());
        products.setImage(power.getImage());
        products.setSalesNumber(0l);
        products.setScore(power.getScore());
        products.setPoints(new BigDecimal(0));
        products.setGmtCreate(date);
        products.setGmtModified(date);
        return productsMapper.insert(products);
    }

    @Override
    public Power select(Long powerId)
    {
        Power power = powerMapper.selectByPrimaryKey(powerId);
        if(power.getImage()!=null&&!power.getImage().equals(""))
        {
            UploadUtil uploadUtil = new UploadUtil();
            power.setImage(uploadUtil.toBase64(power.getImage()));
        }
        return power;
    }

    @Override
    public int update(Power power)
    {
        Date date = new Date();
        power.setGmtModified(date);
        powerMapper.updateByPrimaryKeySelective(power);
        Products products = new Products();
        products.setName(power.getName());
        products.setPrice(power.getPrice());
        products.setImage(power.getImage());
        products.setGmtModified(date);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(power.getPkId());
        criteria.andClassIdEqualTo(8l);
        return productsMapper.updateByExampleSelective(products,productsExample);
    }

    @Override
    public int delete(Long powerId)
    {
        powerMapper.deleteByPrimaryKey(powerId);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(powerId);
        return productsMapper.deleteByExample(productsExample);
    }
}

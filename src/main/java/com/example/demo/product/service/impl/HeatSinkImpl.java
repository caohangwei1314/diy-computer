package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.HeatSinkMapper;
import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.model.HeatSink;
import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import com.example.demo.product.service.HeatSinkService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class HeatSinkImpl implements HeatSinkService {
    @Autowired
    private HeatSinkMapper heatSinkMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int insert(HeatSink heatSink)
    {
        Date date = new Date();
        heatSink.setGmtCreate(date);
        heatSink.setGmtModified(date);
        heatSink.setClassId(4l);
        heatSinkMapper.insertSelective(heatSink);
        Products products = new Products();
        products.setProductId(heatSink.getPkId());
        products.setClassId(4l);
        products.setName(heatSink.getName());
        products.setPrice(heatSink.getPrice());
        products.setImage(heatSink.getImage());
        products.setScore(heatSink.getScore());
        products.setPoints(new BigDecimal(0));
        products.setGmtCreate(date);
        products.setGmtModified(date);
        return productsMapper.insert(products);
    }

    @Override
    public HeatSink select(Long heatSinkId)
    {
        HeatSink heatSink = heatSinkMapper.selectByPrimaryKey(heatSinkId);
        if(heatSink.getImage()!=null&&!heatSink.getImage().equals(""))
        {
            UploadUtil uploadUtil = new UploadUtil();
            heatSink.setImage(uploadUtil.toBase64(heatSink.getImage()));
        }
        return heatSink;
    }

    @Override
    public int update(HeatSink heatSink)
    {
        Date date = new Date();
        heatSink.setGmtModified(date);
        heatSinkMapper.updateByPrimaryKeySelective(heatSink);
        Products products = new Products();
        products.setName(heatSink.getName());
        products.setPrice(heatSink.getPrice());
        products.setImage(heatSink.getImage());
        products.setGmtModified(date);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(heatSink.getPkId());
        criteria.andClassIdEqualTo(4l);
        return productsMapper.updateByExampleSelective(products,productsExample);
    }

    @Override
    public int delete(Long heatSinkId)
    {
        heatSinkMapper.deleteByPrimaryKey(heatSinkId);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(heatSinkId);
        return productsMapper.deleteByExample(productsExample);
    }
}

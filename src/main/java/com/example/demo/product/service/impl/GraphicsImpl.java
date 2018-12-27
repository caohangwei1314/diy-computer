package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.GraphicsMapper;
import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.model.Graphics;
import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import com.example.demo.product.service.GraphicsService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class GraphicsImpl implements GraphicsService {
    @Autowired
    private GraphicsMapper graphicsMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int insert(Graphics graphics)
    {
        Date date = new Date();
        graphics.setGmtCreate(date);
        graphics.setGmtModified(date);
        graphics.setClassId(3l);
        graphicsMapper.insertSelective(graphics);
        Products products = new Products();
        products.setProductId(graphics.getPkId());
        products.setClassId(3l);
        products.setName(graphics.getName());
        products.setPrice(graphics.getPrice());
        products.setImage(graphics.getImage());
        products.setSalesNumber(0l);
        products.setScore(graphics.getScore());
        products.setPoints(new BigDecimal(0));
        products.setGmtCreate(date);
        products.setGmtModified(date);
        return productsMapper.insert(products);
    }

    @Override
    public Graphics select(Long graphicsId)
    {
        Graphics graphics = graphicsMapper.selectByPrimaryKey(graphicsId);
        if(graphics.getImage()!=null&&!graphics.getImage().equals(""))
        {
            UploadUtil uploadUtil = new UploadUtil();
            graphics.setImage(uploadUtil.toBase64(graphics.getImage()));
        }
        return graphics;
    }

    @Override
    public int update(Graphics graphics)
    {
        Date date = new Date();
        graphics.setGmtModified(date);
        graphicsMapper.updateByPrimaryKeySelective(graphics);
        Products products = new Products();
        products.setName(graphics.getName());
        products.setPrice(graphics.getPrice());
        products.setImage(graphics.getImage());
        products.setGmtModified(date);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(graphics.getPkId());
        criteria.andClassIdEqualTo(3l);
        return productsMapper.updateByExampleSelective(products,productsExample);
    }

    @Override
    public int delete(Long graphicsId)
    {
        graphicsMapper.deleteByPrimaryKey(graphicsId);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(graphicsId);
        return productsMapper.deleteByExample(productsExample);
    }
}

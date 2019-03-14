package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.mapper.SsdMapper;
import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import com.example.demo.product.model.Ssd;
import com.example.demo.product.service.SsdService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class SsdImpl implements SsdService {
    @Autowired
    private SsdMapper ssdMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int insert(Ssd ssd)
    {
        Date date = new Date();
        ssd.setGmtCreate(date);
        ssd.setGmtModified(date);
        ssd.setClassId(10l);
        ssdMapper.insertSelective(ssd);
        Products products = new Products();
        products.setProductId(ssd.getPkId());
        products.setClassId(10l);
        products.setName(ssd.getName());
        products.setPrice(ssd.getPrice());
        products.setImage(ssd.getImage());
        products.setSalesNumber(0l);
        products.setScore(ssd.getScore());
        products.setPoints(new BigDecimal(0));
        products.setGmtCreate(date);
        products.setGmtModified(date);
        return productsMapper.insert(products);
    }

    @Override
    public Ssd select(Long ssdId)
    {
        Ssd ssd = ssdMapper.selectByPrimaryKey(ssdId);
        if(ssd.getImage()!=null&&!ssd.getImage().equals(""))
        {
            UploadUtil uploadUtil = new UploadUtil();
            ssd.setImage(uploadUtil.toBase64(ssd.getImage()));
        }
        return ssd;
    }

    @Override
    public int update(Ssd ssd)
    {
        Date date = new Date();
        ssd.setGmtModified(date);
        ssdMapper.updateByPrimaryKeySelective(ssd);
        Products products = new Products();
        products.setName(ssd.getName());
        products.setPrice(ssd.getPrice());
        products.setImage(ssd.getImage());
        products.setGmtModified(date);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(ssd.getPkId());
        criteria.andClassIdEqualTo(10l);
        return productsMapper.updateByExampleSelective(products,productsExample);
    }

    @Override
    public int delete(Long ssdId)
    {
        ssdMapper.deleteByPrimaryKey(ssdId);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(ssdId);
        return productsMapper.deleteByExample(productsExample);
    }
}

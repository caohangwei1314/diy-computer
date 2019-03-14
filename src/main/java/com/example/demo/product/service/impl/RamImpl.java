package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.mapper.RamMapper;
import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import com.example.demo.product.model.Ram;
import com.example.demo.product.service.RamService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class RamImpl implements RamService {
    @Autowired
    private RamMapper ramMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int insert(Ram ram)
    {
        Date date = new Date();
        ram.setGmtCreate(date);
        ram.setGmtModified(date);
        ram.setClassId(9l);
        ramMapper.insertSelective(ram);
        Products products = new Products();
        products.setProductId(ram.getPkId());
        products.setClassId(9l);
        products.setName(ram.getName());
        products.setPrice(ram.getPrice());
        products.setImage(ram.getImage());
        products.setSalesNumber(0l);
        products.setScore(ram.getScore());
        products.setPoints(new BigDecimal(0));
        products.setGmtCreate(date);
        products.setGmtModified(date);
        return productsMapper.insert(products);
    }

    @Override
    public Ram select(Long ramId)
    {
        Ram ram = ramMapper.selectByPrimaryKey(ramId);
        if(ram.getImage()!=null&&!ram.getImage().equals(""))
        {
            UploadUtil uploadUtil = new UploadUtil();
            ram.setImage(uploadUtil.toBase64(ram.getImage()));
        }
        return ram;
    }

    @Override
    public int update(Ram ram)
    {
        Date date = new Date();
        ram.setGmtModified(date);
        ramMapper.updateByPrimaryKeySelective(ram);
        Products products = new Products();
        products.setName(ram.getName());
        products.setPrice(ram.getPrice());
        products.setImage(ram.getImage());
        products.setGmtModified(date);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(ram.getPkId());
        criteria.andClassIdEqualTo(9l);
        return productsMapper.updateByExampleSelective(products,productsExample);
    }

    @Override
    public int delete(Long ramId)
    {
        ramMapper.deleteByPrimaryKey(ramId);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(ramId);
        return productsMapper.deleteByExample(productsExample);
    }
}

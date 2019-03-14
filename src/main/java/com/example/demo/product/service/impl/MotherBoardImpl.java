package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.MotherboardMapper;
import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.model.Motherboard;
import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import com.example.demo.product.service.MotherBoardService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class MotherBoardImpl implements MotherBoardService {
    @Autowired
    private MotherboardMapper motherboardMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int insert(Motherboard motherboard)
    {
        Date date = new Date();
        motherboard.setGmtCreate(date);
        motherboard.setGmtModified(date);
        motherboard.setClassId(7l);
        motherboardMapper.insertSelective(motherboard);
        Products products = new Products();
        products.setProductId(motherboard.getPkId());
        products.setClassId(7l);
        products.setName(motherboard.getName());
        products.setPrice(motherboard.getPrice());
        products.setImage(motherboard.getImage());
        products.setSalesNumber(0l);
        products.setScore(motherboard.getScore());
        products.setPoints(new BigDecimal(0));
        products.setGmtCreate(date);
        products.setGmtModified(date);
        return productsMapper.insert(products);
    }

    @Override
    public Motherboard select(Long motherboradId)
    {
        Motherboard motherboard = motherboardMapper.selectByPrimaryKey(motherboradId);
        if(motherboard.getImage()!=null&&!motherboard.getImage().equals(""))
        {
            UploadUtil uploadUtil = new UploadUtil();
            motherboard.setImage(uploadUtil.toBase64(motherboard.getImage()));
        }
        return motherboard;
    }

    @Override
    public int update(Motherboard motherboard)
    {
        Date date = new Date();
        motherboard.setGmtModified(new Date());
        motherboardMapper.updateByPrimaryKeySelective(motherboard);
        Products products = new Products();
        products.setName(motherboard.getName());
        products.setPrice(motherboard.getPrice());
        products.setImage(motherboard.getImage());
        products.setGmtModified(date);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(motherboard.getPkId());
        criteria.andClassIdEqualTo(7l);
        return productsMapper.updateByExampleSelective(products,productsExample);
    }

    @Override
    public int delete(Long motherboradId)
    {
        motherboardMapper.deleteByPrimaryKey(motherboradId);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(motherboradId);
        return productsMapper.deleteByExample(productsExample);
    }
}

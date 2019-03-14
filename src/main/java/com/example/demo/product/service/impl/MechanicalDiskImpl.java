package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.MechanicalDiskMapper;
import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.model.MechanicalDisk;
import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import com.example.demo.product.service.MechanicalDiskService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class MechanicalDiskImpl implements MechanicalDiskService {
    @Autowired
    private MechanicalDiskMapper mechanicalDiskMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int insert(MechanicalDisk mechanicalDisk)
    {
        Date date = new Date();
        mechanicalDisk.setGmtCreate(date);
        mechanicalDisk.setGmtModified(date);
        mechanicalDisk.setClassId(5l);
        mechanicalDiskMapper.insertSelective(mechanicalDisk);
        Products products = new Products();
        products.setProductId(mechanicalDisk.getPkId());
        products.setClassId(5l);
        products.setName(mechanicalDisk.getName());
        products.setPrice(mechanicalDisk.getPrice());
        products.setImage(mechanicalDisk.getImage());
        products.setSalesNumber(0l);
        products.setScore(mechanicalDisk.getScore());
        products.setPoints(new BigDecimal(0));
        products.setGmtCreate(date);
        products.setGmtModified(date);
        return productsMapper.insert(products);
    }

    @Override
    public MechanicalDisk select(Long mechanicalDiskId)
    {
        MechanicalDisk mechanicalDisk = mechanicalDiskMapper.selectByPrimaryKey(mechanicalDiskId);
        if(mechanicalDisk.getImage()!=null&&!mechanicalDisk.getImage().equals(""))
        {
            UploadUtil uploadUtil = new UploadUtil();
            mechanicalDisk.setImage(uploadUtil.toBase64(mechanicalDisk.getImage()));
        }
        return mechanicalDisk;
    }

    @Override
    public int update(MechanicalDisk mechanicalDisk)
    {
        Date date = new Date();
        mechanicalDisk.setGmtModified(date);
        mechanicalDiskMapper.updateByPrimaryKeySelective(mechanicalDisk);
        Products products = new Products();
        products.setName(mechanicalDisk.getName());
        products.setPrice(mechanicalDisk.getPrice());
        products.setImage(mechanicalDisk.getImage());
        products.setGmtModified(date);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(mechanicalDisk.getPkId());
        criteria.andClassIdEqualTo(5l);
        return productsMapper.updateByExampleSelective(products,productsExample);
    }

    @Override
    public int delete(Long mechanicalDiskId)
    {
        mechanicalDiskMapper.deleteByPrimaryKey(mechanicalDiskId);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(mechanicalDiskId);
        return productsMapper.deleteByExample(productsExample);
    }
}

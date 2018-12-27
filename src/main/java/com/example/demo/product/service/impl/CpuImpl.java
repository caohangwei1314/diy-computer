package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.CpuMapper;
import com.example.demo.product.mapper.ProductsMapper;
import com.example.demo.product.model.Cpu;
import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import com.example.demo.product.service.CpuService;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class CpuImpl implements CpuService {
    @Autowired
    private CpuMapper cpuMapper;

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int insert(Cpu cpu)
    {
        Date date = new Date();
        cpu.setGmtCreate(date);
        cpu.setGmtModified(date);
        cpu.setClassId(2l);
        cpuMapper.insertSelective(cpu);
        Products products = new Products();
        products.setProductId(cpu.getPkId());
        products.setClassId(2l);
        products.setName(cpu.getName());
        products.setPrice(cpu.getPrice());
        products.setImage(cpu.getImage());
        products.setSalesNumber(0l);
        products.setScore(cpu.getScore());
        products.setPoints(new BigDecimal(0));
        products.setGmtCreate(date);
        products.setGmtModified(date);
        return productsMapper.insert(products);
    }

    @Override
    public Cpu select(Long cpuId)
    {
        Cpu cpu = cpuMapper.selectByPrimaryKey(cpuId);
        if(cpu.getImage()!=null&&!cpu.getImage().equals(""))
        {
            UploadUtil uploadUtil = new UploadUtil();
            cpu.setImage(uploadUtil.toBase64(cpu.getImage()));
        }
        return cpu;
    }

    @Override
    public int update(Cpu cpu)
    {
        Date date = new Date();
        cpu.setGmtModified(date);
        cpuMapper.updateByPrimaryKeySelective(cpu);
        Products products = new Products();
        products.setName(cpu.getName());
        products.setPrice(cpu.getPrice());
        products.setImage(cpu.getImage());
        products.setGmtModified(date);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(cpu.getPkId());
        criteria.andClassIdEqualTo(2l);
        return productsMapper.updateByExampleSelective(products,productsExample);
    }

    @Override
    public int delete(Long cpuId)
    {
        cpuMapper.deleteByPrimaryKey(cpuId);
        ProductsExample productsExample = new ProductsExample();
        ProductsExample.Criteria criteria = productsExample.createCriteria();
        criteria.andProductIdEqualTo(cpuId);
        return productsMapper.deleteByExample(productsExample);
    }
}

package com.example.demo.user.service.impl;

import com.example.demo.user.mapper.CollectMapper;
import com.example.demo.user.model.Collect;
import com.example.demo.user.model.CollectExample;
import com.example.demo.product.model.Products;
import com.example.demo.user.service.CollectService;
import com.example.demo.utils.PageBean;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CollectImpl implements CollectService {
    @Autowired
    private CollectMapper collectMapper;

    @Override
    public int insert(Collect collect)
    {
        Date date = new Date();
        collect.setGmtCreate(date);
        collect.setGmtModified(date);
        return collectMapper.insertSelective(collect);
    }

    @Override
    public Collect select(Long userId,Long cId)
    {
        return collectMapper.selectByUidAndCid(userId,cId);
    }

    @Override
    public Collect selectByUidAndCid(Long userId,Long cId)
    {
        return collectMapper.selectByUidAndCid(userId,cId);
    }

    @Override
    public int update(Collect collect)
    {
        Date date = new Date();
        collect.setGmtModified(date);
        CollectExample collectExample = new CollectExample();
        CollectExample.Criteria criteria = collectExample.createCriteria();
        criteria.andCommodityIdEqualTo(collect.getCommodityId());
        return collectMapper.updateByExampleSelective(collect,collectExample);
    }

    @Override
    public int delete(Long userId,Long cId)
    {
        CollectExample collectExample = new CollectExample();
        CollectExample.Criteria criteria = collectExample.createCriteria();
        criteria.andCommodityIdEqualTo(cId);
        criteria.andUserIdEqualTo(userId);
        return collectMapper.deleteByExample(collectExample);
    }

//    @Override
//    public List<Products> selectDetail(Long userId)
//    {
//        List<Products> productsList =collectMapper.selectDetail(userId);
//        UploadUtil uploadUtil = new UploadUtil();
//        for(Products products:productsList)
//        {
//            products.setImage(uploadUtil.toBase64(products.getImage()));
//        }
//        return productsList;
//    }

    @Override
    public long countByUserId(Long userId)
    {
        CollectExample collectExample = new CollectExample();
        CollectExample.Criteria criteria = collectExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return collectMapper.countByExample(collectExample);
    }

    @Override
    public PageBean selectPage(Integer limit, Integer page, Long userId)
    {
        CollectExample collectExample = new CollectExample();
        CollectExample.Criteria criteria = collectExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        int count = (int) collectMapper.countByExample(collectExample);
        if(count>0){
            PageBean pageBean = new PageBean(page,count,limit);
            List<Products> productsList=collectMapper.selectDetail(limit,pageBean.getStart(),userId);
            UploadUtil uploadUtil = new UploadUtil();
            for(Products products:productsList)
            {
                products.setImage(uploadUtil.toBase64(products.getImage()));
            }
            pageBean.setList(productsList);
            return pageBean;
        }else{
            return null;
        }
    }
}

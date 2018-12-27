package com.example.demo.user.service.impl;

import com.example.demo.user.mapper.AddressMapper;
import com.example.demo.user.model.Address;
import com.example.demo.user.model.AddressExample;
import com.example.demo.user.service.AddressService;
import com.example.demo.utils.PageBean;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AddressImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public int insert(Address address)
    {
        Date date = new Date();
        address.setGmtCreate(date);
        address.setGmtModified(date);
        return addressMapper.insertSelective(address);
    }

    @Override
    public PageBean select(Integer limit,Integer page,Long userId)
    {
        AddressExample addressExample = new AddressExample();
        AddressExample.Criteria criteria = addressExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        int count = (int) addressMapper.countByExample(addressExample);
        if(count>0){
            PageBean pageBean = new PageBean(page,count,limit);
            List<Address> addressList=addressMapper.selectByExample(addressExample);
            pageBean.setList(addressList);
            return pageBean;
        }else{
            return null;
        }
    }

    @Override
    public int update(Address address)
    {
        return addressMapper.updateByPrimaryKeySelective(address);
    }

    @Override
    public int delete(Long id,Long userId)
    {
        AddressExample addressExample = new AddressExample();
        AddressExample.Criteria criteria = addressExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andPkIdEqualTo(id);
        return addressMapper.deleteByExample(addressExample);
    }
}

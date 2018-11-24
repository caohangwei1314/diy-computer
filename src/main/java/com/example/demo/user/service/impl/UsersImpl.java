package com.example.demo.user.service.impl;

import com.example.demo.user.mapper.UsersMapper;
import com.example.demo.user.model.Users;
import com.example.demo.user.model.UsersExample;
import com.example.demo.user.service.UsersService;
import com.example.demo.utils.SHA2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UsersImpl implements UsersService{
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users login(Users users){
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andEmailEqualTo(users.getEmail());
        criteria.andPasswordEqualTo(SHA2.SHA256(users.getPassword()));
        List<Users> usersList = usersMapper.selectByExample(usersExample);
        if(usersList.size()>0&&usersList!=null){
            return usersList.get(0);
        }else{
            return null;
        }
    }

    @Override
    public Boolean emailExist(String email){
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andEmailEqualTo(email);
        Long count = usersMapper.countByExample(usersExample);
        if(count>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int insert(Users users){
        Date date = new Date();
        users.setGmtCreate(date);
        users.setGmtModified(date);
        users.setPassword(SHA2.SHA256(users.getPassword()));
        return usersMapper.insertSelective(users);
    }
}

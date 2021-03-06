package com.example.demo.user.service.impl;

import com.example.demo.user.mapper.UsersMapper;
import com.example.demo.user.mapper.UsersMoneyMapper;
import com.example.demo.user.model.Users;
import com.example.demo.user.model.UsersExample;
import com.example.demo.user.model.UsersMoney;
import com.example.demo.user.model.UsersMoneyExample;
import com.example.demo.user.service.UsersService;
import com.example.demo.utils.SHA2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class UsersImpl implements UsersService{
    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private UsersMoneyMapper usersMoneyMapper;
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
    public Users insert(Users users){
        Date date = new Date();
        users.setGmtCreate(date);
        users.setGmtModified(date);
        users.setPassword(SHA2.SHA256(users.getPassword()));
        if(usersMapper.insertSelective(users)==1){
            return users;
        }else {
            return null;
        }
    }

    @Override
    public Users selectByPrimaryKey(Long usersId){
        Users users = usersMapper.selectByPrimaryKey(usersId);
        users.setPassword(null);
        return users;
    }

    @Override
    public Users updateByPrimaryKeySelective(Users users){
        users.setGmtModified(new Date());
        if(usersMapper.updateByPrimaryKeySelective(users)>0){
            Users findUser =  usersMapper.selectByPrimaryKey(users.getPkId());
            return findUser;
        }else{
            return null;
        }
    }

    @Override
    public int updateMoney(BigDecimal money, Long usersId){
        UsersMoneyExample usersMoneyExample = new UsersMoneyExample();
        UsersMoneyExample.Criteria criteria = usersMoneyExample.createCriteria();
        criteria.andUserIdEqualTo(usersId);
        UsersMoney usersMoney = usersMoneyMapper.selectByExample(usersMoneyExample).get(0);
        usersMoney.setMoney(usersMoney.getMoney().add(money));
        if(usersMoney.getMoney().signum()==-1)
        {
            return -1;
        }else
        {
            return usersMoneyMapper.updateByPrimaryKey(usersMoney);
        }
    }

    @Override
    public UsersMoney selectMoney(Long usersId){
        UsersMoneyExample usersMoneyExample = new UsersMoneyExample();
        UsersMoneyExample.Criteria criteria = usersMoneyExample.createCriteria();
        criteria.andUserIdEqualTo(usersId);
        return usersMoneyMapper.selectByExample(usersMoneyExample).get(0);
    }

    @Override
    public String findPassword(Long userId)
    {
        return usersMapper.findPassword(userId);
    }
}

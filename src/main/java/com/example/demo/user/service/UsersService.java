package com.example.demo.user.service;

import com.example.demo.user.model.Users;
import com.example.demo.user.model.UsersMoney;

import java.math.BigDecimal;

public interface UsersService {
    Users login(Users users);

    Boolean emailExist(String email);

    Users insert(Users users);

    Users selectByPrimaryKey(Long userId);

    Users updateByPrimaryKeySelective(Users users);

    int updateMoney(BigDecimal money,Long usersId);

    UsersMoney selectMoney(Long usersId);

    String findPassword(Long userId);
}

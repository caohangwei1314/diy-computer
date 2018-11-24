package com.example.demo.user.service;

import com.example.demo.user.model.Users;

public interface UsersService {
    Users login(Users users);

    Boolean emailExist(String email);

    int insert(Users users);

    Users selectByPrimaryKey(Long userId);
}

package com.example.demo.user.service;

import com.example.demo.user.model.Address;
import com.example.demo.utils.PageBean;

public interface AddressService {

    int insert(Address address);

    PageBean select(Integer limit,Integer page,Long userId);

    int update(Address address);

    int delete(Long id,Long userId);
}

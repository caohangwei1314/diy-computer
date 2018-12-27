package com.example.demo.product.service;

import com.example.demo.product.model.Products;
import com.example.demo.utils.PageBean;

public interface ProductsService {
    PageBean select(Integer limit,Integer page,Long classId,String name,String orderby,String desc,Long price1,Long price2);

    Products selectByPrimaryKey(Long id);

    int delete(Long id,Long classId,Long productId);
}

package com.example.demo.product.mapper;

import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProductsMapper {
    long countByExample(ProductsExample example);

    int deleteByExample(ProductsExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Products record);

    int insertSelective(Products record);

    List<Products> selectByExample(ProductsExample example);

    Products selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Products record, @Param("example") ProductsExample example);

    int updateByExample(@Param("record") Products record, @Param("example") ProductsExample example);

    int updateByPrimaryKeySelective(Products record);

    int updateByPrimaryKey(Products record);

    List<Products> selectByClassId(@Param("limit") Integer limit,
                                   @Param("offset") Integer offset,
                                   @Param("class_id") Long classId,
                                   @Param("LIKE_NAME") String name,
                                   @Param("order_by") String orderby,
                                   @Param("desc") String desc,
                                   @Param("price1") Long price1,
                                   @Param("price2") Long price2);

    long count(@Param("class_id") Long classId,
               @Param("LIKE_NAME")String name,
               @Param("price1") Long price1,
               @Param("price2") Long price2);
}
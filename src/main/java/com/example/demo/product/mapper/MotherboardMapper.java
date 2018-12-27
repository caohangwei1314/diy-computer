package com.example.demo.product.mapper;

import com.example.demo.product.model.Motherboard;
import com.example.demo.product.model.MotherboardExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MotherboardMapper {
    long countByExample(MotherboardExample example);

    int deleteByExample(MotherboardExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Motherboard record);

    int insertSelective(Motherboard record);

    List<Motherboard> selectByExample(MotherboardExample example);

    Motherboard selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Motherboard record, @Param("example") MotherboardExample example);

    int updateByExample(@Param("record") Motherboard record, @Param("example") MotherboardExample example);

    int updateByPrimaryKeySelective(Motherboard record);

    int updateByPrimaryKey(Motherboard record);
}
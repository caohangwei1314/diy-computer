package com.example.demo.product.mapper;

import com.example.demo.product.model.Chassis;
import com.example.demo.product.model.ChassisExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ChassisMapper {
    long countByExample(ChassisExample example);

    int deleteByExample(ChassisExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Chassis record);

    int insertSelective(Chassis record);

    List<Chassis> selectByExample(ChassisExample example);

    Chassis selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Chassis record, @Param("example") ChassisExample example);

    int updateByExample(@Param("record") Chassis record, @Param("example") ChassisExample example);

    int updateByPrimaryKeySelective(Chassis record);

    int updateByPrimaryKey(Chassis record);
}
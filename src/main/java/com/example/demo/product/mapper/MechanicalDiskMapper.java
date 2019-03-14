package com.example.demo.product.mapper;

import com.example.demo.product.model.MechanicalDisk;
import com.example.demo.product.model.MechanicalDiskExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MechanicalDiskMapper {
    long countByExample(MechanicalDiskExample example);

    int deleteByExample(MechanicalDiskExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(MechanicalDisk record);

    int insertSelective(MechanicalDisk record);

    List<MechanicalDisk> selectByExample(MechanicalDiskExample example);

    MechanicalDisk selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") MechanicalDisk record, @Param("example") MechanicalDiskExample example);

    int updateByExample(@Param("record") MechanicalDisk record, @Param("example") MechanicalDiskExample example);

    int updateByPrimaryKeySelective(MechanicalDisk record);

    int updateByPrimaryKey(MechanicalDisk record);
}
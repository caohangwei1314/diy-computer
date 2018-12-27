package com.example.demo.product.mapper;

import com.example.demo.product.model.Cpu;
import com.example.demo.product.model.CpuExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CpuMapper {
    long countByExample(CpuExample example);

    int deleteByExample(CpuExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Cpu record);

    int insertSelective(Cpu record);

    List<Cpu> selectByExample(CpuExample example);

    Cpu selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Cpu record, @Param("example") CpuExample example);

    int updateByExample(@Param("record") Cpu record, @Param("example") CpuExample example);

    int updateByPrimaryKeySelective(Cpu record);

    int updateByPrimaryKey(Cpu record);
}
package com.example.demo.product.mapper;

import com.example.demo.product.model.Ram;
import com.example.demo.product.model.RamExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RamMapper {
    long countByExample(RamExample example);

    int deleteByExample(RamExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Ram record);

    int insertSelective(Ram record);

    List<Ram> selectByExample(RamExample example);

    Ram selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Ram record, @Param("example") RamExample example);

    int updateByExample(@Param("record") Ram record, @Param("example") RamExample example);

    int updateByPrimaryKeySelective(Ram record);

    int updateByPrimaryKey(Ram record);
}
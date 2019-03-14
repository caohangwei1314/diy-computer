package com.example.demo.product.mapper;

import com.example.demo.product.model.HeatSink;
import com.example.demo.product.model.HeatSinkExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HeatSinkMapper {
    long countByExample(HeatSinkExample example);

    int deleteByExample(HeatSinkExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(HeatSink record);

    int insertSelective(HeatSink record);

    List<HeatSink> selectByExample(HeatSinkExample example);

    HeatSink selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") HeatSink record, @Param("example") HeatSinkExample example);

    int updateByExample(@Param("record") HeatSink record, @Param("example") HeatSinkExample example);

    int updateByPrimaryKeySelective(HeatSink record);

    int updateByPrimaryKey(HeatSink record);
}
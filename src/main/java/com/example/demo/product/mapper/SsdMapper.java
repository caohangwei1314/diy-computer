package com.example.demo.product.mapper;

import com.example.demo.product.model.Ssd;
import com.example.demo.product.model.SsdExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SsdMapper {
    long countByExample(SsdExample example);

    int deleteByExample(SsdExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Ssd record);

    int insertSelective(Ssd record);

    List<Ssd> selectByExample(SsdExample example);

    Ssd selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Ssd record, @Param("example") SsdExample example);

    int updateByExample(@Param("record") Ssd record, @Param("example") SsdExample example);

    int updateByPrimaryKeySelective(Ssd record);

    int updateByPrimaryKey(Ssd record);
}
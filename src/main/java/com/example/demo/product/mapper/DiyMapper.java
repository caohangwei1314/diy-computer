package com.example.demo.product.mapper;

import com.example.demo.product.model.Diy;
import com.example.demo.product.model.DiyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface DiyMapper {
    long countByExample(DiyExample example);

    int deleteByExample(DiyExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Diy record);

    int insertSelective(Diy record);

    List<Diy> selectByExample(DiyExample example);

    Diy selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Diy record, @Param("example") DiyExample example);

    int updateByExample(@Param("record") Diy record, @Param("example") DiyExample example);

    int updateByPrimaryKeySelective(Diy record);

    int updateByPrimaryKey(Diy record);
}
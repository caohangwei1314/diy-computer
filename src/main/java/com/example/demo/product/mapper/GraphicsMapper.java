package com.example.demo.product.mapper;

import com.example.demo.product.model.Graphics;
import com.example.demo.product.model.GraphicsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface GraphicsMapper {
    long countByExample(GraphicsExample example);

    int deleteByExample(GraphicsExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Graphics record);

    int insertSelective(Graphics record);

    List<Graphics> selectByExample(GraphicsExample example);

    Graphics selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Graphics record, @Param("example") GraphicsExample example);

    int updateByExample(@Param("record") Graphics record, @Param("example") GraphicsExample example);

    int updateByPrimaryKeySelective(Graphics record);

    int updateByPrimaryKey(Graphics record);
}
package com.example.demo.user.mapper;

import com.example.demo.user.model.Collect;
import com.example.demo.user.model.CollectExample;
import java.util.List;

import com.example.demo.product.model.Products;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CollectMapper {
    long countByExample(CollectExample example);

    int deleteByExample(CollectExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Collect record);

    int insertSelective(Collect record);

    List<Collect> selectByExample(CollectExample example);

    Collect selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByExample(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);

    List<Products> selectDetail(@Param("limit") Integer limit,
                                @Param("offset") Integer offset,
                                @Param("user_id") Long userId);

    Collect selectByUidAndCid(@Param("userId") Long userId,@Param("cId") Long cId);
}
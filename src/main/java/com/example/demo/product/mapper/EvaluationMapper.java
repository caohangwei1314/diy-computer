package com.example.demo.product.mapper;

import com.example.demo.product.model.Evaluation;
import com.example.demo.product.model.EvaluationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EvaluationMapper {
    long countByExample(EvaluationExample example);

    int deleteByExample(EvaluationExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(Evaluation record);

    int insertSelective(Evaluation record);

    List<Evaluation> selectByExample(EvaluationExample example);

    Evaluation selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByExample(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByPrimaryKeySelective(Evaluation record);

    int updateByPrimaryKey(Evaluation record);

    List<Evaluation> selectByClassId(@Param("limit") Integer limit,
                                   @Param("offset") Integer offset,
                                   @Param("product_id") Long productId,
                                   @Param("class_id") Long classId,
                                   @Param("order_by") String orderby,
                                   @Param("desc") String desc);

    long count(@Param("product_id") Long productId,
               @Param("class_id")Long classId);
}
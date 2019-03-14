package com.example.demo.product.service;

import com.example.demo.product.model.Evaluation;
import com.example.demo.utils.PageBean;

public interface EvaluationService {

    int insert(Evaluation evaluation);

    PageBean select(Integer limit, Integer page,Long productId, Long classId,String orderby, String desc);

    int update(Evaluation evaluation);

    int delete(Long evaluationId);

    Evaluation selectByPrimaryKey(Long evaluationId);

    long count(Long classId,Long productId);
}

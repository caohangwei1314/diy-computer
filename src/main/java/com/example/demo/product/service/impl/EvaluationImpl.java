package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.EvaluationMapper;
import com.example.demo.product.model.Evaluation;
import com.example.demo.product.service.EvaluationService;
import com.example.demo.utils.PageBean;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EvaluationImpl implements EvaluationService {

    @Autowired
    private EvaluationMapper evaluationMapper;

    @Override
    public int insert(Evaluation evaluation)
    {
        Date date=new Date();
        evaluation.setGmtCreate(date);
        evaluation.setGmtModified(date);
        return evaluationMapper.insertSelective(evaluation);
    }

    @Override
    public PageBean select(Integer limit, Integer page,Long productId, Long classId, String orderby, String desc)
    {
        int count = (int) evaluationMapper.count(productId,classId);
        if(count>0){
            PageBean pageBean = new PageBean(page,count,limit);
            List<Evaluation> evaluationList=evaluationMapper.selectByClassId(limit,pageBean.getStart(),productId,classId,orderby,desc);
            pageBean.setList(evaluationList);
            return pageBean;
        }else{
            return null;
        }
    }

    @Override
    public Evaluation selectByPrimaryKey(Long id)
    {
        return evaluationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Evaluation evaluation)
    {
        return evaluationMapper.updateByPrimaryKeySelective(evaluation);
    }

    @Override
    public int delete(Long id)
    {
        return evaluationMapper.deleteByPrimaryKey(id);
    }
}

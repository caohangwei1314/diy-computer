package com.example.demo.product.service;

import com.example.demo.product.model.Chassis;
import com.example.demo.product.model.Evaluation;

public interface ChassisService{

    int insert(Chassis chassis);

    Chassis select(Long chassisId);

    int update(Chassis chassis);

    int delete(Long chassisId);

//    Evaluation selectEvaluation(Long productsId,Long classId);

}

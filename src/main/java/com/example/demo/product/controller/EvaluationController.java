package com.example.demo.product.controller;

import com.example.demo.product.model.Evaluation;
import com.example.demo.product.model.Products;
import com.example.demo.product.service.EvaluationService;
import com.example.demo.product.service.ProductsService;
import com.example.demo.user.controller.BaseController;
import com.example.demo.user.model.Users;
import com.example.demo.user.service.UsersService;
import com.example.demo.utils.PageBean;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("products/evaluation")
public class EvaluationController extends BaseController {
    @Autowired
    private EvaluationService evaluationService;

    @Autowired
    private UsersService usersService;

    @Autowired
    private ProductsService productsService;

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> insert(@RequestBody Evaluation evaluation, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        Users users = usersService.selectByPrimaryKey(userId);
        evaluation.setUserId(users.getPkId());
        evaluation.setUserName(users.getName());
        if(evaluationService.insert(evaluation)>0)
        {

            msg.put("code",1);
            msg.put("msg","成功");
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> select(@RequestBody Map<String,Object> conditions)
    {
        msg.clear();
        Integer limit = Integer.parseInt(conditions.get("limit").toString());
        Integer page = Integer.parseInt(conditions.get("page").toString());
        Long classId = null;
        Long productId = null;
        String orderby = "gmt_create";
        String desc = null;
        if(conditions.get("productsId")!=null){
            if(conditions.get("productsId").toString()!="") {
                productId = Long.parseLong(conditions.get("productsId").toString());
            }
        }
        if(conditions.get("classId")!=null){
            if(conditions.get("classId").toString()!="") {
                classId = Long.parseLong(conditions.get("classId").toString());
            }
        }
        if(conditions.get("orderBy")!=null){
            if(conditions.get("orderBy").toString()!=""){
                orderby = conditions.get("orderBy").toString();
            }
        }
        if(conditions.get("desc")!=null){
            if(conditions.get("desc").toString()!=""){
                desc = conditions.get("desc").toString();
            }
        }
        PageBean evaluation = evaluationService.select(limit,page,productId,classId,orderby,desc);
        Products products = productsService.selectByClassIdAndProductId(productId,classId);
        if(evaluation!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",evaluation);
            if(products!=null)
            {
                msg.put("points",products.getPoints());
            }else{
                msg.put("points",0);
            }
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Map<String,Object> selectDetail(@RequestParam("id") Long evaluationId)
    {
        msg.clear();
        Evaluation evaluation = evaluationService.selectByPrimaryKey(evaluationId);
        Products products=productsService.selectByClassIdAndProductId(evaluation.getClassId(),evaluation.getProductsId());
        if(evaluation!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",evaluation);
            msg.put("points",products.getPoints());
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Map<String,Object> update(@RequestBody Evaluation evaluation)
    {
        msg.clear();
        if(evaluationService.update(evaluation)>0)
        {
            msg.put("code",1);
            msg.put("msg","成功");
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public Map<String,Object> delete(@RequestParam("id") Long id, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
            Evaluation evaluation = evaluationService.selectByPrimaryKey(id);
            if(evaluation.getUserId().equals(userId))
            {
                if(evaluationService.delete(evaluation.getPkId())>0)
                {
                    msg.put("code","1");
                    msg.put("msg","成功");
                }
            }else{
                msg.put("code","0");
                msg.put("msg","你没有权限");
            }
        return msg;
    }
}

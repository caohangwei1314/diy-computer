package com.example.demo.product.service.impl;

import com.example.demo.product.mapper.*;
import com.example.demo.product.model.Evaluation;
import com.example.demo.product.model.EvaluationExample;
import com.example.demo.product.model.Products;
import com.example.demo.product.model.ProductsExample;
import com.example.demo.product.service.ProductsService;
import com.example.demo.utils.PageBean;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductsImpl implements ProductsService {
    @Autowired
    private ProductsMapper productsMapper;

    @Autowired
    private ChassisMapper chassisMapper;

    @Autowired
    private CpuMapper cpuMapper;

    @Autowired
    private GraphicsMapper graphicsMapper;

    @Autowired
    private HeatSinkMapper heatSinkMapper;

    @Autowired
    private MechanicalDiskMapper mechanicalDiskMapper;

    @Autowired
    private MonitorMapper monitorMapper;

    @Autowired
    private MotherboardMapper motherboardMapper;

    @Autowired
    private PowerMapper powerMapper;

    @Autowired
    private RamMapper ramMapper;

    @Autowired
    private SsdMapper ssdMapper;
//    @Override
//    public int insert(Products products)
//    {
//        Date date = new Date();
//        products.setGmtCreate(date);
//        products.setGmtModified(date);
//        return productsMapper.insertSelective(products);
//    }

    @Override
    public PageBean select(Integer limit,Integer page,Long classId,String name,String orderby,String desc,Long price1,Long price2)
    {
        if(name!=null&&name!=""){
            name ="%"+name+"%";
        }
        int count = (int) productsMapper.count(classId,name,price1,price2);
        if(count>0){
            PageBean pageBean = new PageBean(page,count,limit);
            List<Products> productsList=productsMapper.selectByClassId(limit,pageBean.getStart(),classId,name,orderby,desc,price1,price2);
            for (Products products:productsList) {
                if(products.getImage()!=null&&!products.getImage().equals(""))
                {
                    UploadUtil uploadUtil = new UploadUtil();
                    products.setImage(uploadUtil.toBase64(products.getImage()));
                }
            }
            pageBean.setList(productsList);
            return pageBean;
        }else{
            return null;
        }
    }

    @Override
    public Products selectByPrimaryKey(Long id)
    {
        return productsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(Long id,Long classId,Long productId)
    {
        if(classId==1l) {
            chassisMapper.deleteByPrimaryKey(productId);
        }else if(classId==2l){
            cpuMapper.deleteByPrimaryKey(productId);
        }else if(classId==3l){
            graphicsMapper.deleteByPrimaryKey(productId);
        }else if(classId==4l){
            heatSinkMapper.deleteByPrimaryKey(productId);
        }else if(classId==5l){
            mechanicalDiskMapper.deleteByPrimaryKey(productId);
        }else if(classId==6l){
            monitorMapper.deleteByPrimaryKey(productId);
        }else if(classId==7l){
            motherboardMapper.deleteByPrimaryKey(productId);
        }else if(classId==8l){
            powerMapper.deleteByPrimaryKey(productId);
        }else if(classId==9l){
            ramMapper.deleteByPrimaryKey(productId);
        }else if(classId==10l){
            ssdMapper.deleteByPrimaryKey(productId);
        }
        return productsMapper.deleteByPrimaryKey(id);
    }

//    @Override
//    public Evaluation selectEvaluation(Long productsId, Long classId)
//    {
//        EvaluationExample evaluationExample = new EvaluationExample();
//        EvaluationExample.Criteria criteria = evaluationExample.createCriteria();
//        criteria.andClassIdEqualTo(classId);
//        criteria.andProductsIdEqualTo(productsId);
//        return
//    }

    @Override
    public Products selectByClassIdAndProductId(Long classId,Long productId)
    {
        ProductsExample example = new ProductsExample();
        ProductsExample.Criteria criteria = example.createCriteria();
        criteria.andClassIdEqualTo(classId);
        criteria.andProductIdEqualTo(productId);
        List<Products> productsList= productsMapper.selectByExample(example);
        if(productsList.size()>0&&productsList!=null)
        {
            return productsList.get(0);
        }else{
            return null;
        }
    }
}

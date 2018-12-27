package com.example.demo.product.controller;

import com.example.demo.product.model.Products;
import com.example.demo.product.service.*;
import com.example.demo.user.controller.BaseController;
import com.example.demo.utils.PageBean;
import com.example.demo.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("products")
public class ProductsController extends BaseController {
    @Autowired
    private ProductsService productsService;

    @Autowired
    private ChassisService chassisService;

    @Autowired
    private CpuService cpuService;

    @Autowired
    private GraphicsService graphicsService;

    @Autowired
    private HeatSinkService heatSinkService;

    @Autowired
    private MechanicalDiskService mechanicalDiskService;

    @Autowired
    private MonitorService monitorService;

    @Autowired
    private MotherBoardService motherBoardService;

    @Autowired
    private PowerService powerService;

    @Autowired
    private RamService ramService;

    @Autowired
    private SsdService ssdService;

//    @RequestMapping(method = RequestMethod.POST)
//    public Map<String,Object> insert(@RequestBody Products products, HttpServletRequest request)
//    {
//        msg.clear();
//        Long userId=Long.parseLong(request.getAttribute("userId").toString());
//        products.setUserId(userId);
//        if(chassisService.insert(chassis)>0)
//        {
//            msg.put("code",1);
//            msg.put("msg","成功");
//        }else{
//            msg.put("code",0);
//            msg.put("msg","失败");
//        }
//        return msg;
//    }
//
    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> select(@RequestBody Map<String,Object> conditions)
    {
        msg.clear();
        Integer limit = Integer.parseInt(conditions.get("limit").toString());
        Integer page = Integer.parseInt(conditions.get("page").toString());
        Long classId = null;
        String name = null;
        String orderby = null;
        String desc = null;
        Long price1=null;
        Long price2=null;
        if(conditions.get("classId")!=null){
            if(conditions.get("classId").toString()!="") {
                classId = Long.parseLong(conditions.get("classId").toString());
            }
        }
        if(conditions.get("name")!=null){
            if(conditions.get("name").toString()!=""){
                name = conditions.get("name").toString();
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
        if(conditions.get("price1")!=null){
            if(conditions.get("price1").toString()!=""){
                price1 =Long.parseLong(conditions.get("price1").toString());
            }
        }
        if(conditions.get("price2")!=null){
            if(conditions.get("price2").toString()!=""){
                price2 =Long.parseLong(conditions.get("price2").toString());
            }
        }
        PageBean products = productsService.select(limit,page,classId,name,orderby,desc,price1,price2);
        if(products!=null)
        {
            msg.put("code",1);
            msg.put("msg","成功");
            msg.put("data",products);
        }else{
            msg.put("code",0);
            msg.put("msg","失败");
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Map<String,Object> selectDetail(@RequestParam("id") Long id)
    {
        msg.clear();
            Products products = productsService.selectByPrimaryKey(id);
            Long classId = products.getClassId();
            Long productId = products.getProductId();
            if(products!=null)
            {
                if(classId==1l) {
                    msg.put("data",chassisService.select(productId));
                }else if(classId==2l){
                    msg.put("data",cpuService.select(productId));
                }else if(classId==3l){
                    msg.put("data",graphicsService.select(productId));
                }else if(classId==4l){
                    msg.put("data",heatSinkService.select(productId));
                }else if(classId==5l){
                    msg.put("data",mechanicalDiskService.select(productId));
                }else if(classId==6l){
                    msg.put("data",monitorService.select(productId));
                }else if(classId==7l){
                    msg.put("data",motherBoardService.select(productId));
                }else if(classId==8l){
                    msg.put("data",powerService.select(productId));
                }else if(classId==9l){
                    msg.put("data",ramService.select(productId));
                }else if(classId==10l){
                    msg.put("data",ssdService.select(productId));
                }
                msg.put("code",1);
                msg.put("msg","成功");
            }else{
                msg.put("code","0");
                msg.put("msg","该商品已被删除");
            }
        return msg;
    }
//
//    @RequestMapping(method = RequestMethod.PUT)
//    public Map<String,Object> update(@RequestBody Chassis chassis)
//    {
//        msg.clear();
//        if(chassisService.update(chassis)>0)
//        {
//            msg.put("code",1);
//            msg.put("msg","成功");
//        }else{
//            msg.put("code",0);
//            msg.put("msg","失败");
//        }
//        return msg;
//    }
//
    @RequestMapping(value ="/remove",method = RequestMethod.DELETE)
    public Map<String,Object> delete(@RequestParam("id") Long id, HttpServletRequest request)
    {
        msg.clear();
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        if(userId!=1l)
        {
            msg.put("code","0");
            msg.put("msg","你没有权限");
        }else{
            Products products = productsService.selectByPrimaryKey(id);
            if(products!=null)
            {
                if(productsService.delete(products.getPkId(),products.getClassId(),products.getProductId())>0)
                {
                    msg.put("code","1");
                    msg.put("msg","成功");
                }
            }else{
                msg.put("code","0");
                msg.put("msg","该商品已被删除");
            }
        }
        return msg;
    }
}

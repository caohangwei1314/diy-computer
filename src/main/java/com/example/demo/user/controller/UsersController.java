package com.example.demo.user.controller;

import com.example.demo.product.service.ShoppingCartService;
import com.example.demo.user.model.Users;
import com.example.demo.user.service.UsersService;
import com.example.demo.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("users")
public class UsersController extends BaseController{

    @Autowired
    private UsersService usersService;

    @Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map<String,Object> login(@RequestBody Users requestUser) {
        msg.clear();
        try{
            if(requestUser.getEmail().equals("") || requestUser.getPassword().equals("")){
                msg.put("code","0");
                msg.put("msg","请输入账号和密码");
                return msg;
            }
            Users users= usersService.login(requestUser);
            long count=shoppingCartService.countByUserId(users.getPkId());
            JwtUtil jwtUtil = new JwtUtil();
            String token = jwtUtil.createJWT(users.getPkId().toString(),users.getEmail(),1000*60*60*24*14);
            msg.put("code","1");
            msg.put("msg","登陆成功");
            msg.put("name",users.getName());
            msg.put("token",token);
            if(count>0)
            {
                msg.put("shoppingCart","1");
            }else{
                msg.put("shoppingCart","0");
            }
        }catch (Exception e){
            msg.remove("token");
            msg.put("code","0");
            msg.put("msg",e.getMessage());
        }
        return msg;
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public Map<String, Object> createUser (@RequestBody Users users){
        msg.clear();
        try{
            if(usersService.emailExist(users.getEmail())){
                msg.put("code","0");
                msg.put("msg","账号已存在");
            }else{
                Users u = usersService.insert(users);
                if(u!=null){
                    JwtUtil jwtUtil = new JwtUtil();
                    String token = jwtUtil.createJWT(u.getPkId().toString(),u.getEmail(),1000*60*60*24*14);
                    msg.put("code","1");
                    msg.put("msg","成功");
//                    msg.put("token",token);
                }else{
                    msg.put("code","0");
                    msg.put("msg","失败");
                }
            }
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg",e);
        }
        return msg;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Map<String, Object> getUser (HttpServletRequest request){
        msg.clear();
        Long usersId=Long.parseLong(request.getAttribute("userId").toString());
        try{
            Users users = usersService.selectByPrimaryKey(usersId);
            msg.put("code","1");
            msg.put("msg","成功");
            msg.put("users",users);
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg",e);
        }
        return msg;
    }

    @RequestMapping(value="modified",method = RequestMethod.POST)
    public Map<String, Object> updateUser (HttpServletRequest request,@RequestBody Users users){
        Long userId=Long.parseLong(request.getAttribute("userId").toString());
        msg.clear();
        try{
            users.setPkId(userId);
            Users findUser = usersService.updateByPrimaryKeySelective(users);
            msg.put("code","1");
            msg.put("msg","成功");
            msg.put("user",findUser);
        }catch (Exception e){
            msg.put("code","0");
            msg.put("msg",e.getMessage());
        }
        return msg;
    }

}

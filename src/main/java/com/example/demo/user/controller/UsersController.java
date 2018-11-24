package com.example.demo.user.controller;

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
            JwtUtil jwtUtil = new JwtUtil();
            String token = jwtUtil.createJWT(users.getPkId().toString(),users.getEmail(),1000*60*60*24*14);
            msg.put("code","1");
            msg.put("msg","登陆成功");
            msg.put("token",token);
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
                int i = usersService.insert(users);
                if(i==1){
                    msg.put("code","1");
                    msg.put("msg","成功");
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

}

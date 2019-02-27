package com.controller;

import com.bean.Sign;
import com.bean.User;
import com.service.SginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.service.UserService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by ${邹} on 2019/1/11.
 * 描述：
 */
@Controller
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private SginService sginService;
    @RequestMapping("/register")
    public String register(User user, @RequestParam String name,
                           @RequestParam String password, @RequestParam String state,
                           HttpSession session){
        user.setName( name );
        user.setPassword( password );
        user.setState( state );
        userService.register( user );
        session.setAttribute( "user",user );
        return "success";
    }
    @RequestMapping("/login")
    public String login(@RequestParam String name,
                        @RequestParam String password,
                        Model model,HttpSession session){
        User name2 = userService.login( name );
        if (name == null){
            model.addAttribute( "msg","用户不存在" );
            return "../../index";
        }
        if (name == null || password == null){
            model.addAttribute( "msg" ,"用户名或密码不能为空");
            return "../../index";
        }
        User user = new User();
        session.setAttribute( "user",name2.getId() );
        model.addAttribute( "uId",name2.getId() );
        return "success";
    }
    @RequestMapping("/login2")
    public String login2(@RequestParam String name,
                        @RequestParam String password,
                        Model model,HttpSession session){
        User name2 = userService.login( name );
        String role = name2.getState();
//        System.out.println( role );
        if (name == null){
            model.addAttribute( "msg","用户不存在" );
            return "../../index";
        }
        if (name == null || password == null){
            model.addAttribute( "msg" ,"用户名或密码不能为空");
            return "../../index";
        }
        String teacher = "老师";
        if (role.equals( teacher )){
            List<Sign> sign = sginService.list();
            model.addAttribute( "sginList",sign );
            System.out.println( sign );
            return "attendance_info";
        }
        User user = new User();
        session.setAttribute( "user",name2.getId() );
        model.addAttribute( "uId",name2.getId() );
        return "success";
    }
}

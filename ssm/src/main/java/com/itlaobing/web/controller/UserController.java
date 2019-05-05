package com.itlaobing.web.controller;

import com.itlaobing.entity.User;
import com.itlaobing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/user/**")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping( path = "/sign-up" , method = RequestMethod.GET)
    public String signUpPage(HttpServletRequest request) {


        return "sign-up" ;
    }
    @RequestMapping(path = "/sign-up",method = RequestMethod.POST)
    public String signUp(@RequestBody User user){

        int i = userService.save(user);
        //对结果判断，i>0去登陆，i<0去注册
        System.out.println("user"+user.getUsername()+"password:"+user.getPassword());
        if (i>0){
            System.out.println("success");
            return "sign-in";
        }else{
            System.out.println("failed");
            return "sign-up";
        }
    }
//    @RequestMapping("/test")
//    @ResponseBody
//    public User testUser(@RequestBody User user){
//        System.out.println("user:"+user.getUsername());
//        return user;
//    }

}

package com.szkingdom.controller;

import com.szkingdom.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/index")
    public String get(){
        loginService.test();
        System.out.println("controller执行成功");
        return "index";
    }
    @RequestMapping("/login")
    public String index(){
        return "login";
    }
}

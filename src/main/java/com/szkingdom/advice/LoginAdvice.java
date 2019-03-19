package com.szkingdom.advice;

import com.szkingdom.mapper.UserMapper;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class LoginAdvice {
    @Before(value = "execution( public void com.szkingdom.serviceImpl.LoginServiceImpl.test(..))")
    public void log(){

    }
    public void text(){
        System.out.println("增加了输出");
    }
    public void add(){
        System.out.print("在主干上做了修改");
    }
    
    public String sayHello(){
        return "hello";
    }
}

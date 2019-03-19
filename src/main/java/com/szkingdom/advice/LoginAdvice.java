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

    }
    
    public String sayHello(){
        return "hello";
    }
    public String say(){
        System.out.println("在分支上新增了say方法");
    }
}

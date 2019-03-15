package com.szkingdom.advice;

import com.szkingdom.mapper.UserMapper;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class LoginAdvice {
    @Before(value = "execution( public void com.szkingdom.serviceImpl.LoginServiceImpl.test(..))")
    public void log(){
        System.out.println("这是前置通知");
        System.out.println("模拟第二个人");
        System.out,println("远程库发生了改变");
    }
}

package com.szkingdom.advice;

import com.szkingdom.mapper.UserMapper;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class LoginAdvice {
    @Before(value = "execution( public void com.szkingdom.serviceImpl.LoginServiceImpl.test(..))")
    public void log(){
        System.out.println("我的代码");

    }
}

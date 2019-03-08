package com.szkingdom.serviceImpl;

import com.szkingdom.mapper.UserMapper;
import com.szkingdom.pojo.User;
import com.szkingdom.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void test() {
        System.out.println("loginServiceImpl执行了");
        User user = userMapper.selectUserById(1);
        System.out.println(user.getDepartment());
    }
}

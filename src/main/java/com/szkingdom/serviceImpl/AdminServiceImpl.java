package com.szkingdom.serviceImpl;

import com.szkingdom.mapper.RoleMapper;
import com.szkingdom.mapper.UserMapper;
import com.szkingdom.pojo.Role;
import com.szkingdom.pojo.User;
import com.szkingdom.service.AdminService;
import com.szkingdom.util.MyUser;
import com.szkingdom.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public UserUtil getAllUser() {
        UserUtil util = new UserUtil();
        List<MyUser> mylist=new ArrayList<>();
        List<User> list = userMapper.selectAllUser();
        for(int i =0;i<list.size();i++){
            MyUser myuser = new MyUser();
            myuser.setDepartment(list.get(i).getDepartment());
            myuser.setId(list.get(i).getId());
            myuser.setName(list.get(i).getName());
            Role role = roleMapper.selectRoleById(list.get(i).getRoleid());
            myuser.setRole(role.getRolename());
            mylist.add(myuser);
        }
        util.setList(mylist);
        return util;
    }
}

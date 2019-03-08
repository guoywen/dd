package com.szkingdom.mapper;

import com.szkingdom.pojo.User;

import java.util.List;

public interface UserMapper {
    public User selectUserById(int id);
    public List<User> selectAllUser();


}

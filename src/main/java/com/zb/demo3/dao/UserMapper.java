package com.zb.demo3.dao;

import com.zb.demo3.entity.User;

import java.util.List;

public interface UserMapper {
    public List<User> findAll(User user);
    public int addInfo(User user);
}

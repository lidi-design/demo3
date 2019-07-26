package com.zb.demo3.service;

import com.zb.demo3.dao.UserMapper;
import com.zb.demo3.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findAll(User user) {
        return userMapper.findAll(user);
    }

    @Override
    public int addInfo(User user) {
        return userMapper.addInfo(user);
    }
}

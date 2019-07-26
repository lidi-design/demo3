package com.zb.demo3.service;

import com.zb.demo3.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll(User user);
    public int addInfo(User user);
}

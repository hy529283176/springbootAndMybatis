package com.pancake.springboot.mybaties.demo.service.impl;

import com.pancake.springboot.mybaties.demo.mapper.UserMapper;
import com.pancake.springboot.mybaties.demo.model.User;
import com.pancake.springboot.mybaties.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(String id) {
        return userMapper.selectUserById(id);
    }
}

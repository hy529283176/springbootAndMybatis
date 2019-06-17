package com.pancake.springboot.mybaties.demo.service;

import com.pancake.springboot.mybaties.demo.model.User;

public interface UserService {

    User selectUserById(String id);
}

package com.pancake.springboot.mybaties.demo.mapper;

import com.pancake.springboot.mybaties.demo.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectUserById(@Param(value = "id") String id);
}

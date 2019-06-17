package com.pancake.springboot.mybaties.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pancake.springboot.mybaties.demo.model.User;
import com.pancake.springboot.mybaties.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get/user")
    @ResponseBody
    public String getUserById(@RequestParam(value = "id") String id) {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            User user = this.userService.selectUserById(id);
            json = mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}

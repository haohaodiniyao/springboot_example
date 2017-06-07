package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.entity.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaokai on 2017/6/7.
 */
@RestController
@RequestMapping("/api")
public class DemoController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("users")
    public List<User> users(){
        List<User> list = userMapper.selectByExample(null);
        return list;
    }
}

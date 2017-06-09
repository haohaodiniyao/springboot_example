package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.entity.UserMapper;
import com.example.demo.entity.UserMapperExtend;
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
    @Autowired
    private UserMapperExtend userMapperExtend;

    @RequestMapping("/users")
    public List<User> users(){
        List<User> list = userMapper.selectByExample(null);
        return list;
    }

    @RequestMapping("/saveUser")
    public User saveUser(User user){
       userMapper.insertSelective(user);
        return user;
    }

    @RequestMapping("/saveUserBatch")
    public void saveUserBatch(){
        List<User> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            User user = new User();
            user.setPword(i+"");
            user.setUname(i+"");
            list.add(user);
        }
        userMapperExtend.insertSelectiveBatch(list);
    }

    @RequestMapping("/userList")
    public List<User> saveUser(){
        User user = new User();
        user.setUname("2");
        return userMapperExtend.selectByUser(user);
    }
}

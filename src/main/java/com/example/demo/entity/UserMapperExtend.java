package com.example.demo.entity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapperExtend extends UserMapper{
    /**
     * 批量插入
     * @param users
     */
    void insertSelectiveBatch(List<User> users);
    List<User> selectByUser(User user);
}
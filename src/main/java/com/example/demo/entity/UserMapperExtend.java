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
    List<PartitionInfo> selectPartition();
    void addPartition(@Param("partitionName") String partitionName,@Param("partitionValue") String partitionValue);
    void dropPartition(@Param("partitionName") String partitionName);
    void truncatePartition(@Param("partitionName") String partitionName);
    List<ExplainInfo> explainSql(@Param("executeSql") String executeSql);
}
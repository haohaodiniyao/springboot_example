package com.example.demo;

import com.example.demo.entity.*;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.assertj.core.internal.Bytes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Base64Utils;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot3ApplicationTests {
	@Autowired
	private UserMapper userMapper;
    @Autowired
	private UserMapperExtend userMapperExtend;
	@Test
	public void generateToken(){
		String uuid = UUID.randomUUID().toString();
		System.out.println("#######"+uuid);
		String encodeId = Base64Utils.encodeToString(uuid.replace("-","").getBytes());
		System.out.println("#######"+ encodeId);
		String decodeId = new String(Base64Utils.decodeFromString(encodeId));
		System.out.println("#######"+ decodeId);
	}
	@Test
	public void queryPartitions() {
		//查询表分区信息
		List<PartitionInfo> partitionInfos = userMapperExtend.selectPartition();
		for(PartitionInfo partitionInfo : partitionInfos){
			System.out.println(partitionInfo);
		}
	}
	@Test
	public void addPartition(){
		//新增表分区
		try {
			userMapperExtend.addPartition("d"+DateFormatUtils.format(DateUtils.addDays(new Date(),4),"yyyyMMdd"),DateFormatUtils.format(DateUtils.addDays(new Date(),4),"yyyy-MM-dd"));
		}catch (Exception e){
			System.out.println("#######"+e.getMessage()+"########");
		}
	}
	@Test
	public void dropPartition(){
		//删除表分区
		try {
			userMapperExtend.dropPartition("d20170702");
		}catch (Exception e){
			System.out.println("#######"+e.getMessage()+"########");
		}
	}
	@Test
	public void truncatePartition(){
		//清空表分区数据(保留分区结构)
		try {
			userMapperExtend.truncatePartition("d20170702");
		}catch (Exception e){
			System.out.println("#######"+e.getMessage()+"########");
		}
	}
	@Test
	public void explainSql(){
		try {
			List<ExplainInfo> list = userMapperExtend.explainSql("select * from user order by create_date");
			for(ExplainInfo explainInfo:list){
				System.out.println(explainInfo);
			}
		}catch (Exception e){
			System.out.println("#######"+e.getMessage()+"########");
		}
	}
	@Test
	public void addUser(){
		for(int i=1;i<10;i++){
			User user = new User();
			user.setUname("uname"+i);
			user.setPword("pword"+i);
			user.setCreateDate(DateUtils.addDays(new Date(),20));
			userMapper.insertSelective(user);
		}
	}
}

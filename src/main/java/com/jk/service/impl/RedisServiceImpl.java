package com.jk.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jk.model.Supplier;
import com.jk.service.RedisService;


@Service
public class RedisServiceImpl implements RedisService {


	@Autowired
    private StringRedisTemplate stringRedisTemplate;
/*	@Autowired
	private RedisTemplate<String, Object> redisTemplate;*/
	//操作redis
	
		//新增到redis
		@Override
		public void addSupplierToRedis(Supplier sup) {
			sup.setSupId(UUID.randomUUID().toString());
			sup.setSupName("韦神科技111");
			sup.setSupPhone("99999");
			sup.setSupGoods("火箭111");
			sup.setSupAreaId(2);
			sup.setStatus(0);
			sup.setSupMoney(99888.88);
			//其实他们两者之间的区别主要在于他们使用的序列化类。
			//RedisTemplate使用的是 JdkSerializationRedisSerializer
			//StringRedisTemplate使用的是 StringRedisSerializer
			stringRedisTemplate.opsForList().leftPush("supList", sup.getSupId().toString());
			stringRedisTemplate.opsForValue().set("supplier"+sup.getSupId().toString(),JSON.toJSONString(sup));
			//RedisUtil redisUtil =new RedisUtil();
			//redisUtil.set("supplier11", sup);
		
		}
		
		//从redis中查询
		@Override
		public void querySupplierToRedis() {
			List<String> list = stringRedisTemplate.opsForList().range("supList", 0, -1);
			List<String> valueList=new ArrayList<String>();
			for (String keyId : list) {
				String value = stringRedisTemplate.opsForValue().get("supplier"+keyId);
				System.out.println(value);
				valueList.add(value);
			}
			
		}
		
		//修改redis数据
		@Override
		public void updateSupplierToRedis(Supplier sup) {
			stringRedisTemplate.opsForValue().set("supplier"+sup.getSupId().toString(), JSON.toJSONString(sup));
		}
		
		//删除
		@Override
		public void deleteSupplierToRedis(Supplier sup) {
			stringRedisTemplate.delete("supplier"+sup.getSupId().toString());
		}
		
}

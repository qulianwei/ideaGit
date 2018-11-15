package com.jk.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.jk.model.Supplier;
import com.jk.service.MongodbService;

@Service
public class MongodbServiceImpl implements MongodbService {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	//新增到mongodb
	@Override
	public void addMongodb(Supplier sup) {
		sup.setSupId(UUID.randomUUID().toString());
		sup.setSupName("韦神科技111");
		sup.setSupPhone("99999");
		sup.setSupGoods("火箭111");
		sup.setSupAreaId(2);
		sup.setStatus(0);
		sup.setSupMoney(99888.88);
		mongoTemplate.insert(sup, "supplier");
	}
	
	//删除
	@Override
	public void deleteMongodb(Supplier sup) {
		Query query = Query.query(Criteria.where("supId").is(sup.getSupId()));
		mongoTemplate.remove(query,"supplier");
	}
	
	//修改
	@Override
	public void updateMongodb(Supplier sup) {
		Query query = Query.query(Criteria.where("supId").is(sup.getSupId()));
		Update update = new Update();
		update.set("supName", sup.getSupName());
		update.set("supPhone", sup.getSupPhone());
		update.set("supAreaId", sup.getSupAreaId());
		update.set("supGoods", sup.getSupGoods());
		update.set("supMoney", sup.getSupMoney());
		update.set("status", sup.getStatus());
		mongoTemplate.updateFirst(query, update, Supplier.class);
		
	}
	
	//查询
	@Override
	public HashMap<String, Object> queryMongodb(Integer pageSize, Integer start) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		Query query=new Query();
		Criteria criteria = new Criteria();
		long count = mongoTemplate.count(query, Supplier.class);
		List<Supplier> supList = mongoTemplate.find(query.skip(start).limit(pageSize), Supplier.class);
		map.put("total", count);
		map.put("rows", supList);
		return map;
	}
	
	

}

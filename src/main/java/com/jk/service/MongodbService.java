package com.jk.service;

import java.util.HashMap;
import java.util.List;

import com.jk.model.Supplier;

public interface MongodbService {

	//新增
	void addMongodb(Supplier sup);
	//删除
	void deleteMongodb(Supplier sup);
	//更新
	void updateMongodb(Supplier sup);
	//查询
	HashMap<String, Object> queryMongodb(Integer pageSize, Integer start);
	

}

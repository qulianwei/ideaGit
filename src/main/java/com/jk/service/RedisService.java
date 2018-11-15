package com.jk.service;

import com.jk.model.Supplier;

public interface RedisService {

	//操作redis
		//新增
		void addSupplierToRedis(Supplier sup);

		//查询
		void querySupplierToRedis();
		//修改
		void updateSupplierToRedis(Supplier sup);
		//删除
		void deleteSupplierToRedis(Supplier sup);

}

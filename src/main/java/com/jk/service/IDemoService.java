package com.jk.service;

import com.jk.model.Supplier;

import java.util.LinkedHashMap;
import java.util.List;

public interface IDemoService {

	//查询
	List<LinkedHashMap<String, Object>> querySupplier();
	//新增
	void addSupplier(Supplier sup);
	//修改
	void updateSupplier(Supplier sup);
	//删除
	void deleteSupplier(Supplier sup);
	
	
}

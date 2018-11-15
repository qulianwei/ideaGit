package com.jk.service.impl;

import com.jk.mapper.DemoMapper;
import com.jk.model.Supplier;
import com.jk.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

@Service
public class DemoServiceImpl implements IDemoService {
	
	@Autowired
	private DemoMapper demoMapper;
	
	
	//mysql两表联查
	@Override
	public List<LinkedHashMap<String, Object>> querySupplier() {
		return demoMapper.querySupplier();
	}
	
	//mysql 新增
	@Override
	public void addSupplier(Supplier sup) {
		demoMapper.addSupplier(sup);
	}

	//修改 mysql
	@Override
	public void updateSupplier(Supplier sup) {
		demoMapper.updateSupplier(sup);
	}
	
	//删除mysql
	@Override
	public void deleteSupplier(Supplier sup) {
		demoMapper.deleteSupplier(sup);
	}
	
	
	
	
	

}

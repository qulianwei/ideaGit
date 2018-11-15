package com.jk.mapper;

import com.jk.model.Supplier;
import org.apache.ibatis.annotations.*;

import java.util.LinkedHashMap;
import java.util.List;

@Mapper
public interface DemoMapper {

	@ResultType(LinkedHashMap.class)
	@Select(value="SELECT * from t_supplier sup left join t_suparea area on sup.supAreaId=area.areaId ")
	List<LinkedHashMap<String, Object>> querySupplier();

	
	@Insert(value="INSERT into t_supplier VALUES(UUID(),#{sup.supName},#{sup.supPhone},#{sup.supAreaId},#{sup.supGoods},#{sup.supMoney},#{sup.status})")
	void addSupplier(@Param(value = "sup") Supplier sup);

	@Update(value="update t_supplier set supName=#{sup.supName},supPhone=#{sup.supPhone},supAreaId=#{sup.supAreaId},supGoods=#{sup.supGoods},supMoney=#{sup.supMoney},status=#{sup.status} where supId=#{sup.supId}")
	void updateSupplier(@Param(value = "sup") Supplier sup);

	@Delete(value="DELETE FROM t_supplier where supId=#{sup.supId}")
	void deleteSupplier(@Param(value = "sup") Supplier sup);

}

package com.jk.model;

import java.io.Serializable;

public class Supplier implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//供应商id
	private String supId;
	//供应商姓名
	private String supName;
	//供应商电话
	private String supPhone;
	//供应商地址id
	private Integer supAreaId;
	//供应商货物
	private String supGoods;
	//供应商金额
	private Double supMoney;
	//供应商状态 0:不在担任;1:还在
	private Integer status;
	
	
	
	
	public String getSupId() {
		return supId;
	}
	public void setSupId(String supId) {
		this.supId = supId;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public String getSupPhone() {
		return supPhone;
	}
	public void setSupPhone(String supPhone) {
		this.supPhone = supPhone;
	}
	
	public Integer getSupAreaId() {
		return supAreaId;
	}
	public void setSupAreaId(Integer supAreaId) {
		this.supAreaId = supAreaId;
	}
	public String getSupGoods() {
		return supGoods;
	}
	public void setSupGoods(String supGoods) {
		this.supGoods = supGoods;
	}
	public Double getSupMoney() {
		return supMoney;
	}
	public void setSupMoney(Double supMoney) {
		this.supMoney = supMoney;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	

}

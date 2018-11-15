package com.jk.model;

import java.io.Serializable;

public class SupArea implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//地区id
	private Integer areaId;
	//地区名称
	private String areaName;
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	


}

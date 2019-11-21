package com.marine.entity;

import java.util.ArrayList;
import java.util.List;

public class CulSpeedResponse{

	SpeedData SpeedData ; //总体速度数据
	List<ArrayList<AreaSpeed>> AreaSpeed ; //区域速度数据

	public com.marine.entity.SpeedData getSpeedData() {
		return SpeedData;
	}

	public void setSpeedData(com.marine.entity.SpeedData speedData) {
		SpeedData = speedData;
	}

	public List<ArrayList<com.marine.entity.AreaSpeed>> getAreaSpeed() {
		return AreaSpeed;
	}

	public void setAreaSpeed(List<ArrayList<com.marine.entity.AreaSpeed>> areaSpeed) {
		AreaSpeed = areaSpeed;
	}
}
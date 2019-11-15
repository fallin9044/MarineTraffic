package com.marine.entity;

public class CulSpeedResponse{

	SpeedData SpeedData ; //总体速度数据
	AreaSpeed[][] AreaSpeed ; //区域速度数据

	public com.marine.entity.SpeedData getSpeedData() {
		return SpeedData;
	}

	public void setSpeedData(com.marine.entity.SpeedData speedData) {
		SpeedData = speedData;
	}

	public com.marine.entity.AreaSpeed[][] getAreaSpeed() {
		return AreaSpeed;
	}

	public void setAreaSpeed(com.marine.entity.AreaSpeed[][] areaSpeed) {
		AreaSpeed = areaSpeed;
	}
}
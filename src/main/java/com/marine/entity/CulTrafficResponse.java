package com.marine.entity;

public class CulTrafficResponse{

	AreaTraffic[][] AreaTraffics ; //区域交通量统计
	TrafficData TrafficData ; //综合小时交通量统计

	public AreaTraffic[][] getAreaTraffics() {
		return AreaTraffics;
	}

	public void setAreaTraffics(AreaTraffic[][] areaTraffics) {
		AreaTraffics = areaTraffics;
	}

	public com.marine.entity.TrafficData getTrafficData() {
		return TrafficData;
	}

	public void setTrafficData(com.marine.entity.TrafficData trafficData) {
		TrafficData = trafficData;
	}
}
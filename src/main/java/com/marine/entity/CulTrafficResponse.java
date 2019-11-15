package com.marine.entity;

import java.util.ArrayList;
import java.util.List;

public class CulTrafficResponse{

	List<ArrayList<AreaTraffic>> AreaTraffics ; //区域交通量统计
	TrafficData TrafficData ; //综合小时交通量统计

	public List<ArrayList<AreaTraffic>> getAreaTraffics() {
		return AreaTraffics;
	}

	public void setAreaTraffics(List<ArrayList<AreaTraffic>> areaTraffics) {
		AreaTraffics = areaTraffics;
	}

	public com.marine.entity.TrafficData getTrafficData() {
		return TrafficData;
	}

	public void setTrafficData(com.marine.entity.TrafficData trafficData) {
		TrafficData = trafficData;
	}
}
package com.marine.entity;

import java.util.ArrayList;
import java.util.List;

public class CulDensityResponse{

	DensityData DensityData ; //总体密度数据
	List<ArrayList<AreaDensity>> AreaDensity ; //区域密度数据

	public com.marine.entity.DensityData getDensityData() {
		return DensityData;
	}

	public void setDensityData(com.marine.entity.DensityData densityData) {
		DensityData = densityData;
	}

	public List<ArrayList<com.marine.entity.AreaDensity>> getAreaDensity() {
		return AreaDensity;
	}

	public void setAreaDensity(List<ArrayList<com.marine.entity.AreaDensity>> areaDensity) {
		AreaDensity = areaDensity;
	}
}
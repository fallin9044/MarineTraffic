package com.marine.entity;

public class CulDensityResponse{

	DensityData DensityData ; //总体密度数据
	AreaDensity[][] AreaDensity ; //区域密度数据

	public com.marine.entity.DensityData getDensityData() {
		return DensityData;
	}

	public void setDensityData(com.marine.entity.DensityData densityData) {
		DensityData = densityData;
	}

	public com.marine.entity.AreaDensity[][] getAreaDensity() {
		return AreaDensity;
	}

	public void setAreaDensity(com.marine.entity.AreaDensity[][] areaDensity) {
		AreaDensity = areaDensity;
	}
}
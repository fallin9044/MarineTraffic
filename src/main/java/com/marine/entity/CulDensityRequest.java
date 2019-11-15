package com.marine.entity;

public class CulDensityRequest{

	Data Time ; //时间
	Data DeltaT ; //时间范围
	Integer LotDivide ; //经度划分数目
	Integer LatDivide ; //纬度划分数目

	public Data getTime() {
		return Time;
	}

	public void setTime(Data time) {
		Time = time;
	}

	public Data getDeltaT() {
		return DeltaT;
	}

	public void setDeltaT(Data deltaT) {
		DeltaT = deltaT;
	}

	public Integer getLotDivide() {
		return LotDivide;
	}

	public void setLotDivide(Integer lotDivide) {
		LotDivide = lotDivide;
	}

	public Integer getLatDivide() {
		return LatDivide;
	}

	public void setLatDivide(Integer latDivide) {
		LatDivide = latDivide;
	}
}
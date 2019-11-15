package com.marine.entity;

public class CulTrafficRequest{
	Data StartTime ; //起始时间
	Data EndTime ; //结束时间
	Integer LotDivide ; //经度划分数目
	Integer LatDivide ; //纬度划分数目
	Integer Day ;

	public Data getStartTime() {
		return StartTime;
	}

	public void setStartTime(Data startTime) {
		StartTime = startTime;
	}

	public Data getEndTime() {
		return EndTime;
	}

	public void setEndTime(Data endTime) {
		EndTime = endTime;
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

	public Integer getDay() {
		return Day;
	}

	public void setDay(Integer day) {
		Day = day;
	}
}
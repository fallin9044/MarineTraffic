package com.marine.entity;

import java.util.List;

public class SpeedData{
	Double ShipSpeed ; //平均速度
	Integer ShipCnt ; //船舶总数
	List<Integer> ShipSpeedRange ; //船舶速度区间

	public Double getShipSpeed() {
		return ShipSpeed;
	}

	public void setShipSpeed(Double shipSpeed) {
		ShipSpeed = shipSpeed;
	}

	public Integer getShipCnt() {
		return ShipCnt;
	}

	public void setShipCnt(Integer shipCnt) {
		ShipCnt = shipCnt;
	}

	public List<Integer> getShipSpeedRange() {
		return ShipSpeedRange;
	}

	public void setShipSpeedRange(List<Integer> shipSpeedRange) {
		ShipSpeedRange = shipSpeedRange;
	}
}
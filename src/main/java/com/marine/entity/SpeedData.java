package com.marine.entity;

public class SpeedData{
	Double ShipSpeed ; //平均速度
	Integer ShipCnt ; //船舶总数
	Integer[] ShipSpeedRange ; //船舶速度区间

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

	public Integer[] getShipSpeedRange() {
		return ShipSpeedRange;
	}

	public void setShipSpeedRange(Integer[] shipSpeedRange) {
		ShipSpeedRange = shipSpeedRange;
	}
}
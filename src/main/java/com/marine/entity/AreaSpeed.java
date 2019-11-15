package com.marine.entity;
import java.util.Map;
public class AreaSpeed{
	Double ShipSpeed ; //区域平均速度
	Integer ShipCnt ; //区域船舶总数
	Double ShipSpeedSumMap ; //区域单一船舶数据项速度取值总和
	Map<Integer,Integer> ShipSpeedCnt ; //区域单一船舶数据项数目

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

	public Double getShipSpeedSumMap() {
		return ShipSpeedSumMap;
	}

	public void setShipSpeedSumMap(Double shipSpeedSumMap) {
		ShipSpeedSumMap = shipSpeedSumMap;
	}

	public Map<Integer, Integer> getShipSpeedCnt() {
		return ShipSpeedCnt;
	}

	public void setShipSpeedCnt(Map<Integer, Integer> shipSpeedCnt) {
		ShipSpeedCnt = shipSpeedCnt;
	}
}
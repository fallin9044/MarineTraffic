package com.marine.entity;
import java.util.Map;
public class AreaDensity{
	Map<Integer,Integer> ShipMap ; //区域内船舶map
	Integer Density ; //区域内船舶密度
	Map<Integer,Integer> SmallShipShipMap ; //区域内小船map
	Integer SmallShipDensity ; //区域内小船密度
	Map<Integer,Integer> BigShipShipMap ; //区域内大船map
	Integer BigShipDensity ; //区域内大船密度
	Map<Integer,Integer> Type0ShipMap ; //区域内渔船map
	Integer Type0Density ; //区域内渔船密度
	Map<Integer,Integer> Type6xShipMap ; //区域内客船map
	Integer Type6xDensity ; //区域内客船密度
	Map<Integer,Integer> Type7xShipMap ; //区域内货轮map
	Integer Type7xDensity ; //区域内货轮密度
	Map<Integer,Integer> Type8xShipMap ; //区域内油轮map
	Integer Type8xDensity ; //区域内油轮密度

	public Map<Integer, Integer> getShipMap() {
		return ShipMap;
	}

	public void setShipMap(Map<Integer, Integer> shipMap) {
		ShipMap = shipMap;
	}

	public Integer getDensity() {
		return Density;
	}

	public void setDensity(Integer density) {
		Density = density;
	}

	public Map<Integer, Integer> getSmallShipShipMap() {
		return SmallShipShipMap;
	}

	public void setSmallShipShipMap(Map<Integer, Integer> smallShipShipMap) {
		SmallShipShipMap = smallShipShipMap;
	}

	public Integer getSmallShipDensity() {
		return SmallShipDensity;
	}

	public void setSmallShipDensity(Integer smallShipDensity) {
		SmallShipDensity = smallShipDensity;
	}

	public Map<Integer, Integer> getBigShipShipMap() {
		return BigShipShipMap;
	}

	public void setBigShipShipMap(Map<Integer, Integer> bigShipShipMap) {
		BigShipShipMap = bigShipShipMap;
	}

	public Integer getBigShipDensity() {
		return BigShipDensity;
	}

	public void setBigShipDensity(Integer bigShipDensity) {
		BigShipDensity = bigShipDensity;
	}

	public Map<Integer, Integer> getType0ShipMap() {
		return Type0ShipMap;
	}

	public void setType0ShipMap(Map<Integer, Integer> type0ShipMap) {
		Type0ShipMap = type0ShipMap;
	}

	public Integer getType0Density() {
		return Type0Density;
	}

	public void setType0Density(Integer type0Density) {
		Type0Density = type0Density;
	}

	public Map<Integer, Integer> getType6xShipMap() {
		return Type6xShipMap;
	}

	public void setType6xShipMap(Map<Integer, Integer> type6xShipMap) {
		Type6xShipMap = type6xShipMap;
	}

	public Integer getType6xDensity() {
		return Type6xDensity;
	}

	public void setType6xDensity(Integer type6xDensity) {
		Type6xDensity = type6xDensity;
	}

	public Map<Integer, Integer> getType7xShipMap() {
		return Type7xShipMap;
	}

	public void setType7xShipMap(Map<Integer, Integer> type7xShipMap) {
		Type7xShipMap = type7xShipMap;
	}

	public Integer getType7xDensity() {
		return Type7xDensity;
	}

	public void setType7xDensity(Integer type7xDensity) {
		Type7xDensity = type7xDensity;
	}

	public Map<Integer, Integer> getType8xShipMap() {
		return Type8xShipMap;
	}

	public void setType8xShipMap(Map<Integer, Integer> type8xShipMap) {
		Type8xShipMap = type8xShipMap;
	}

	public Integer getType8xDensity() {
		return Type8xDensity;
	}

	public void setType8xDensity(Integer type8xDensity) {
		Type8xDensity = type8xDensity;
	}
}
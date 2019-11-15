package com.marine.entity;

import java.util.List;
import java.util.Map;

public class CulSpacingResponse{
	Double MinSpacing ; //最短相距距离
	Integer MinSpaceA ; //最短相距距离-船A
	Integer MinSpaceB ; //最短相距距离-船B
	Position APosition ; //A船位置
	Position BPosition ; //B船位置
	Double SpacingMap ; //船舶最短距离map
	List<Integer> SpacingRange ; //船舶最短距离分布区间
	Double ShipSpacing ; //船舶间距map
	Map<Integer,Track> TrackMap ; //船舶当前信息

	public Double getMinSpacing() {
		return MinSpacing;
	}

	public void setMinSpacing(Double minSpacing) {
		MinSpacing = minSpacing;
	}

	public Integer getMinSpaceA() {
		return MinSpaceA;
	}

	public void setMinSpaceA(Integer minSpaceA) {
		MinSpaceA = minSpaceA;
	}

	public Integer getMinSpaceB() {
		return MinSpaceB;
	}

	public void setMinSpaceB(Integer minSpaceB) {
		MinSpaceB = minSpaceB;
	}

	public Position getAPosition() {
		return APosition;
	}

	public void setAPosition(Position APosition) {
		this.APosition = APosition;
	}

	public Position getBPosition() {
		return BPosition;
	}

	public void setBPosition(Position BPosition) {
		this.BPosition = BPosition;
	}

	public Double getSpacingMap() {
		return SpacingMap;
	}

	public void setSpacingMap(Double spacingMap) {
		SpacingMap = spacingMap;
	}

	public List<Integer> getSpacingRange() {
		return SpacingRange;
	}

	public void setSpacingRange(List<Integer> spacingRange) {
		SpacingRange = spacingRange;
	}

	public Double getShipSpacing() {
		return ShipSpacing;
	}

	public void setShipSpacing(Double shipSpacing) {
		ShipSpacing = shipSpacing;
	}

	public Map<Integer, Track> getTrackMap() {
		return TrackMap;
	}

	public void setTrackMap(Map<Integer, Track> trackMap) {
		TrackMap = trackMap;
	}
}
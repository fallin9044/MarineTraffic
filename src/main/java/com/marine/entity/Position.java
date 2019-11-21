package com.marine.entity;

public class Position{
	Double Longitude ; //经度
	Double Latitude ; //纬度

	public Position(Double longitude, Double latitude) {
		Longitude = longitude;
		Latitude = latitude;
	}

	public Double getLongitude() {
		return Longitude;
	}

	public void setLongitude(Double longitude) {
		Longitude = longitude;
	}

	public Double getLatitude() {
		return Latitude;
	}

	public void setLatitude(Double latitude) {
		Latitude = latitude;
	}
}
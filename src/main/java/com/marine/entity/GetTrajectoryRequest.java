package com.marine.entity;

public class GetTrajectoryRequest{
	Integer MMSI ; 
	Boolean IsCleaning ;

	public Integer getMMSI() {
		return MMSI;
	}

	public void setMMSI(Integer MMSI) {
		this.MMSI = MMSI;
	}

	public Boolean getCleaning() {
		return IsCleaning;
	}

	public void setCleaning(Boolean cleaning) {
		IsCleaning = cleaning;
	}
}
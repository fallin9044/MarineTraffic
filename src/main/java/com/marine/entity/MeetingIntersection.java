package com.marine.entity;

public class MeetingIntersection{
	Double DCPA ; //最近会遇距离
	Double TCPA ; //最近会遇时间
	Double Azimuth ; //会遇方向
	Double VR ; //相对速度

	public Double getDCPA() {
		return DCPA;
	}

	public void setDCPA(Double DCPA) {
		this.DCPA = DCPA;
	}

	public Double getTCPA() {
		return TCPA;
	}

	public void setTCPA(Double TCPA) {
		this.TCPA = TCPA;
	}

	public Double getAzimuth() {
		return Azimuth;
	}

	public void setAzimuth(Double azimuth) {
		Azimuth = azimuth;
	}

	public Double getVR() {
		return VR;
	}

	public void setVR(Double VR) {
		this.VR = VR;
	}
}
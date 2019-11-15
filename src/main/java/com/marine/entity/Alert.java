package com.marine.entity;
public class Alert{
	Integer MMSI ; //预警对象船只
	Track ShipTrack ; //预警对象船只数据
	Boolean IsEmergency ; //是否是紧急情况
	Double Distance ; //相对距离
	Double Azimuth ; //相对方位
	MeetingIntersection MeetingIntersection ; //危险会遇预测数据
	Double UDCPA ; //DCPA预警值
	Double UTCPA ; //TCPA预警值
	Double UB ; //相对角度预警值
	Double UD ; //相对距离预警
	Double UV ; //本船速度预警值
	Double Danger ; //预警评分



	public Integer getMMSI() {
		return MMSI;
	}

	public void setMMSI(Integer MMSI) {
		this.MMSI = MMSI;
	}

	public Track getShipTrack() {
		return ShipTrack;
	}

	public void setShipTrack(Track shipTrack) {
		ShipTrack = shipTrack;
	}

	public Boolean getEmergency() {
		return IsEmergency;
	}

	public void setEmergency(Boolean emergency) {
		IsEmergency = emergency;
	}

	public Double getDistance() {
		return Distance;
	}

	public void setDistance(Double distance) {
		Distance = distance;
	}

	public Double getAzimuth() {
		return Azimuth;
	}

	public void setAzimuth(Double azimuth) {
		Azimuth = azimuth;
	}

	public MeetingIntersection getMeetingIntersection() {
		return MeetingIntersection;
	}

	public void setMeetingIntersection(MeetingIntersection meetingIntersection) {
		MeetingIntersection = meetingIntersection;
	}

	public Double getUDCPA() {
		return UDCPA;
	}

	public void setUDCPA(Double UDCPA) {
		this.UDCPA = UDCPA;
	}

	public Double getUTCPA() {
		return UTCPA;
	}

	public void setUTCPA(Double UTCPA) {
		this.UTCPA = UTCPA;
	}

	public Double getUB() {
		return UB;
	}

	public void setUB(Double UB) {
		this.UB = UB;
	}

	public Double getUD() {
		return UD;
	}

	public void setUD(Double UD) {
		this.UD = UD;
	}

	public Double getUV() {
		return UV;
	}

	public void setUV(Double UV) {
		this.UV = UV;
	}

	public Double getDanger() {
		return Danger;
	}

	public void setDanger(Double danger) {
		Danger = danger;
	}
}
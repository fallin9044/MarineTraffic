package com.marine.entity;

public class Warning{
	Track MasterShipTrack ; //主船只数据
	Alert[] Alerts ; //警告列表
	Data Time ; //警告时间

	public Track getMasterShipTrack() {
		return MasterShipTrack;
	}

	public void setMasterShipTrack(Track masterShipTrack) {
		MasterShipTrack = masterShipTrack;
	}

	public Alert[] getAlerts() {
		return Alerts;
	}

	public void setAlerts(Alert[] alerts) {
		Alerts = alerts;
	}

	public Data getTime() {
		return Time;
	}

	public void setTime(Data time) {
		Time = time;
	}
}
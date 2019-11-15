package com.marine.entity;

public class PositionMeta{
	Integer ID ; //`json:"ID"`
	Integer MessageType ; //`json:"Message_Type"`//消息类型
	Integer RepeatIndicator ; //`json:"Repeat_Indicator"`//转发指示符
	Integer MMSI ; //`json:"MMSI"`//用户ID
	Integer NavigationStatus ; //`json:"Navigation_Status"`//导航状态
	Integer ROT ; //`json:"ROT"`//旋转速率
	Double SOG ; //`json:"SOG"`//地面航速
	Integer PositionAccuracy ; //`json:"Position_Accuracy"`//位置精度
	Double Longitude ; //`json:"Longitude"`//经度
	Double Latitude ; //`json:"Latitude"`//纬度
	Double COG ; //`json:"COG"`//地面航向
	Integer HDG ; //`json:"HDG"`//实际航向
	Integer TimeStamp ; //`json:"Time_stamp"`//时戳
	Integer ReservedForRegional ; //`json:"Reserved_for_regional"`//特定操作指示符
	Integer RAIMFlag ; //`json:"RAIM_flag"`//RAIM标志
	Integer Year ; //`json:"Year"`//年
	Integer Month ; //`json:"Month"`//月
	Integer Day ; //`json:"Day"`//日
	Integer Hour ; //`json:"Hour"`//时
	Integer Minute ; //`json:"Minute"`//分
	Integer Second ; //`json:"Second"`//秒

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public Integer getMessageType() {
		return MessageType;
	}

	public void setMessageType(Integer messageType) {
		MessageType = messageType;
	}

	public Integer getRepeatIndicator() {
		return RepeatIndicator;
	}

	public void setRepeatIndicator(Integer repeatIndicator) {
		RepeatIndicator = repeatIndicator;
	}

	public Integer getMMSI() {
		return MMSI;
	}

	public void setMMSI(Integer MMSI) {
		this.MMSI = MMSI;
	}

	public Integer getNavigationStatus() {
		return NavigationStatus;
	}

	public void setNavigationStatus(Integer navigationStatus) {
		NavigationStatus = navigationStatus;
	}

	public Integer getROT() {
		return ROT;
	}

	public void setROT(Integer ROT) {
		this.ROT = ROT;
	}

	public Double getSOG() {
		return SOG;
	}

	public void setSOG(Double SOG) {
		this.SOG = SOG;
	}

	public Integer getPositionAccuracy() {
		return PositionAccuracy;
	}

	public void setPositionAccuracy(Integer positionAccuracy) {
		PositionAccuracy = positionAccuracy;
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

	public Double getCOG() {
		return COG;
	}

	public void setCOG(Double COG) {
		this.COG = COG;
	}

	public Integer getHDG() {
		return HDG;
	}

	public void setHDG(Integer HDG) {
		this.HDG = HDG;
	}

	public Integer getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(Integer timeStamp) {
		TimeStamp = timeStamp;
	}

	public Integer getReservedForRegional() {
		return ReservedForRegional;
	}

	public void setReservedForRegional(Integer reservedForRegional) {
		ReservedForRegional = reservedForRegional;
	}

	public Integer getRAIMFlag() {
		return RAIMFlag;
	}

	public void setRAIMFlag(Integer RAIMFlag) {
		this.RAIMFlag = RAIMFlag;
	}

	public Integer getYear() {
		return Year;
	}

	public void setYear(Integer year) {
		Year = year;
	}

	public Integer getMonth() {
		return Month;
	}

	public void setMonth(Integer month) {
		Month = month;
	}

	public Integer getDay() {
		return Day;
	}

	public void setDay(Integer day) {
		Day = day;
	}

	public Integer getHour() {
		return Hour;
	}

	public void setHour(Integer hour) {
		Hour = hour;
	}

	public Integer getMinute() {
		return Minute;
	}

	public void setMinute(Integer minute) {
		Minute = minute;
	}

	public Integer getSecond() {
		return Second;
	}

	public void setSecond(Integer second) {
		Second = second;
	}
}
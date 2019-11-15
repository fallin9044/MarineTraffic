package com.marine.entity;

public class InfoMeta{
	Integer ID ; //'json:"ID"`
	Integer NavigationStatus ; ////'json:"Navigation_Status"`//转发指示符
	Integer MMSI ; //'json:"MMSI"`//用户ID
	Integer AIS ; //'json:"AIS"`//AIS版本指示符
	Integer IMO ; //'json:"IMO"`//IMO编号
	String CallSign ; //'json:"Call_Sign"`//呼号
	String Name ; //'json:"Name"`//名称
	Integer ShipType ; //'json:"Ship_Type"`//船舶和货物类型
	Integer A ; //'json:"A"`//船舱距船头距离
	Integer B ; //'json:"B"`//船舱距船尾距离
	Integer C ; //'json:"C"`//船舱距左侧距离
	Integer D ; //'json:"D"`//船舱距右侧距离
	Integer Length ; //'json:"Length"`//船舶长度
	Integer Width ; //'json:"Width"`//船舶宽度
	Integer PositionType ; //'json:"Position_Type"`//位置精度
	Integer ETAMonth ; //'json:"ETA_Month"`//预估到达时间-月
	Integer ETADay ; //'json:"ETA_Day"`//预估到达时间-日
	Integer ETAHour ; //'json:"ETA_Hour"`//预估到达时间-时
	Integer ETAMinute ; //'json:"ETA_Minute"`//预估到达时间-分
	Double Draft ; //'json:"Draft"`//目前最大静态吃水
	String Destination ; //'json:"Destination"`//目的地
	Integer Year ; //'json:"Year"`//年
	Integer Month ; //'json:"Month"`//月
	Integer Day ; //'json:"Day"`//日
	Integer Hour ; //'json:"Hour"`//时
	Integer Minute ; //'json:"Minute"`//分
	Integer Second ; //'json:"Second"`//秒

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public Integer getNavigationStatus() {
		return NavigationStatus;
	}

	public void setNavigationStatus(Integer navigationStatus) {
		NavigationStatus = navigationStatus;
	}

	public Integer getMMSI() {
		return MMSI;
	}

	public void setMMSI(Integer MMSI) {
		this.MMSI = MMSI;
	}

	public Integer getAIS() {
		return AIS;
	}

	public void setAIS(Integer AIS) {
		this.AIS = AIS;
	}

	public Integer getIMO() {
		return IMO;
	}

	public void setIMO(Integer IMO) {
		this.IMO = IMO;
	}

	public String getCallSign() {
		return CallSign;
	}

	public void setCallSign(String callSign) {
		CallSign = callSign;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getShipType() {
		return ShipType;
	}

	public void setShipType(Integer shipType) {
		ShipType = shipType;
	}

	public Integer getA() {
		return A;
	}

	public void setA(Integer a) {
		A = a;
	}

	public Integer getB() {
		return B;
	}

	public void setB(Integer b) {
		B = b;
	}

	public Integer getC() {
		return C;
	}

	public void setC(Integer c) {
		C = c;
	}

	public Integer getD() {
		return D;
	}

	public void setD(Integer d) {
		D = d;
	}

	public Integer getLength() {
		return Length;
	}

	public void setLength(Integer length) {
		Length = length;
	}

	public Integer getWidth() {
		return Width;
	}

	public void setWidth(Integer width) {
		Width = width;
	}

	public Integer getPositionType() {
		return PositionType;
	}

	public void setPositionType(Integer positionType) {
		PositionType = positionType;
	}

	public Integer getETAMonth() {
		return ETAMonth;
	}

	public void setETAMonth(Integer ETAMonth) {
		this.ETAMonth = ETAMonth;
	}

	public Integer getETADay() {
		return ETADay;
	}

	public void setETADay(Integer ETADay) {
		this.ETADay = ETADay;
	}

	public Integer getETAHour() {
		return ETAHour;
	}

	public void setETAHour(Integer ETAHour) {
		this.ETAHour = ETAHour;
	}

	public Integer getETAMinute() {
		return ETAMinute;
	}

	public void setETAMinute(Integer ETAMinute) {
		this.ETAMinute = ETAMinute;
	}

	public Double getDraft() {
		return Draft;
	}

	public void setDraft(Double draft) {
		Draft = draft;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
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
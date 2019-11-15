package com.marine.entity;

public class TrafficData{
	Integer[] HourTrafficSum ; //各区域小时流量相和->总小时流量和
	Integer[] HourSmallShipTrafficSum ; //各区域小时小船流量相和->总小时小船流量和
	Integer[] HourBigShipTrafficSum ; //各区域小时大船流量相和->总小时大船流量和
	Integer[] HourType0ShipTrafficSum ; //各区域小时渔船流量相和
	Integer[] HourType6xShipTrafficSum ; //各区域小时客船流量相和
	Integer[] HourType7xShipTrafficSum ; //各区域小时货轮流量相和
	Integer[] HourType8xShipTrafficSum ; //各区域小时油轮流量相和
	Integer[] HourOtherTypeShipTraffic ; 
	Integer Traffic ; 
	Integer SmallShipTraffic ; 
	Integer BigShipTraffic ; 
	Integer Type0ShipTraffic ; 
	Integer Type6xShipTraffic ; 
	Integer Type7xShipTraffic ; 
	Integer Type8xShipTraffic ; 
	Integer OtherTypeShipTraffic ;

	public Integer[] getHourTrafficSum() {
		return HourTrafficSum;
	}

	public void setHourTrafficSum(Integer[] hourTrafficSum) {
		HourTrafficSum = hourTrafficSum;
	}

	public Integer[] getHourSmallShipTrafficSum() {
		return HourSmallShipTrafficSum;
	}

	public void setHourSmallShipTrafficSum(Integer[] hourSmallShipTrafficSum) {
		HourSmallShipTrafficSum = hourSmallShipTrafficSum;
	}

	public Integer[] getHourBigShipTrafficSum() {
		return HourBigShipTrafficSum;
	}

	public void setHourBigShipTrafficSum(Integer[] hourBigShipTrafficSum) {
		HourBigShipTrafficSum = hourBigShipTrafficSum;
	}

	public Integer[] getHourType0ShipTrafficSum() {
		return HourType0ShipTrafficSum;
	}

	public void setHourType0ShipTrafficSum(Integer[] hourType0ShipTrafficSum) {
		HourType0ShipTrafficSum = hourType0ShipTrafficSum;
	}

	public Integer[] getHourType6xShipTrafficSum() {
		return HourType6xShipTrafficSum;
	}

	public void setHourType6xShipTrafficSum(Integer[] hourType6xShipTrafficSum) {
		HourType6xShipTrafficSum = hourType6xShipTrafficSum;
	}

	public Integer[] getHourType7xShipTrafficSum() {
		return HourType7xShipTrafficSum;
	}

	public void setHourType7xShipTrafficSum(Integer[] hourType7xShipTrafficSum) {
		HourType7xShipTrafficSum = hourType7xShipTrafficSum;
	}

	public Integer[] getHourType8xShipTrafficSum() {
		return HourType8xShipTrafficSum;
	}

	public void setHourType8xShipTrafficSum(Integer[] hourType8xShipTrafficSum) {
		HourType8xShipTrafficSum = hourType8xShipTrafficSum;
	}

	public Integer[] getHourOtherTypeShipTraffic() {
		return HourOtherTypeShipTraffic;
	}

	public void setHourOtherTypeShipTraffic(Integer[] hourOtherTypeShipTraffic) {
		HourOtherTypeShipTraffic = hourOtherTypeShipTraffic;
	}

	public Integer getTraffic() {
		return Traffic;
	}

	public void setTraffic(Integer traffic) {
		Traffic = traffic;
	}

	public Integer getSmallShipTraffic() {
		return SmallShipTraffic;
	}

	public void setSmallShipTraffic(Integer smallShipTraffic) {
		SmallShipTraffic = smallShipTraffic;
	}

	public Integer getBigShipTraffic() {
		return BigShipTraffic;
	}

	public void setBigShipTraffic(Integer bigShipTraffic) {
		BigShipTraffic = bigShipTraffic;
	}

	public Integer getType0ShipTraffic() {
		return Type0ShipTraffic;
	}

	public void setType0ShipTraffic(Integer type0ShipTraffic) {
		Type0ShipTraffic = type0ShipTraffic;
	}

	public Integer getType6xShipTraffic() {
		return Type6xShipTraffic;
	}

	public void setType6xShipTraffic(Integer type6xShipTraffic) {
		Type6xShipTraffic = type6xShipTraffic;
	}

	public Integer getType7xShipTraffic() {
		return Type7xShipTraffic;
	}

	public void setType7xShipTraffic(Integer type7xShipTraffic) {
		Type7xShipTraffic = type7xShipTraffic;
	}

	public Integer getType8xShipTraffic() {
		return Type8xShipTraffic;
	}

	public void setType8xShipTraffic(Integer type8xShipTraffic) {
		Type8xShipTraffic = type8xShipTraffic;
	}

	public Integer getOtherTypeShipTraffic() {
		return OtherTypeShipTraffic;
	}

	public void setOtherTypeShipTraffic(Integer otherTypeShipTraffic) {
		OtherTypeShipTraffic = otherTypeShipTraffic;
	}
}
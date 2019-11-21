package com.marine.entity;

import java.util.List;

public class TrafficData{
	List<Integer> HourTrafficSum ; //各区域小时流量相和->总小时流量和
	List<Integer> HourSmallShipTrafficSum ; //各区域小时小船流量相和->总小时小船流量和
	List<Integer> HourBigShipTrafficSum ; //各区域小时大船流量相和->总小时大船流量和
	List<Integer> HourType0ShipTrafficSum ; //各区域小时渔船流量相和
	List<Integer> HourType6xShipTrafficSum ; //各区域小时客船流量相和
	List<Integer> HourType7xShipTrafficSum ; //各区域小时货轮流量相和
	List<Integer> HourType8xShipTrafficSum ; //各区域小时油轮流量相和
	Integer HourOtherTypeShipTraffic ;
	Integer Traffic ;
	Integer SmallShipTraffic ;
	Integer BigShipTraffic ; 
	Integer Type0ShipTraffic ; 
	Integer Type6xShipTraffic ; 
	Integer Type7xShipTraffic ; 
	Integer Type8xShipTraffic ; 
	Integer OtherTypeShipTraffic ;

	public List<Integer> getHourTrafficSum() {
		return HourTrafficSum;
	}

	public void setHourTrafficSum(List<Integer> hourTrafficSum) {
		HourTrafficSum = hourTrafficSum;
	}

	public List<Integer> getHourSmallShipTrafficSum() {
		return HourSmallShipTrafficSum;
	}

	public void setHourSmallShipTrafficSum(List<Integer> hourSmallShipTrafficSum) {
		HourSmallShipTrafficSum = hourSmallShipTrafficSum;
	}

	public List<Integer> getHourBigShipTrafficSum() {
		return HourBigShipTrafficSum;
	}

	public void setHourBigShipTrafficSum(List<Integer> hourBigShipTrafficSum) {
		HourBigShipTrafficSum = hourBigShipTrafficSum;
	}

	public List<Integer> getHourType0ShipTrafficSum() {
		return HourType0ShipTrafficSum;
	}

	public void setHourType0ShipTrafficSum(List<Integer> hourType0ShipTrafficSum) {
		HourType0ShipTrafficSum = hourType0ShipTrafficSum;
	}

	public List<Integer> getHourType6xShipTrafficSum() {
		return HourType6xShipTrafficSum;
	}

	public void setHourType6xShipTrafficSum(List<Integer> hourType6xShipTrafficSum) {
		HourType6xShipTrafficSum = hourType6xShipTrafficSum;
	}

	public List<Integer> getHourType7xShipTrafficSum() {
		return HourType7xShipTrafficSum;
	}

	public void setHourType7xShipTrafficSum(List<Integer> hourType7xShipTrafficSum) {
		HourType7xShipTrafficSum = hourType7xShipTrafficSum;
	}

	public List<Integer> getHourType8xShipTrafficSum() {
		return HourType8xShipTrafficSum;
	}

	public void setHourType8xShipTrafficSum(List<Integer> hourType8xShipTrafficSum) {
		HourType8xShipTrafficSum = hourType8xShipTrafficSum;
	}

	public Integer getHourOtherTypeShipTraffic() {
		return HourOtherTypeShipTraffic;
	}

	public void setHourOtherTypeShipTraffic(Integer hourOtherTypeShipTraffic) {
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
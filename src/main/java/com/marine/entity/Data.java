package com.marine.entity;

public class Data{

	Integer Year ; 
	Integer Month ; 
	Integer Day ; 
	Integer Hour ; 
	Integer Minute ; 
	Integer Second ;

	public Data(Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second) {
		Year = year;
		Month = month;
		Day = day;
		Hour = hour;
		Minute = minute;
		Second = second;
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
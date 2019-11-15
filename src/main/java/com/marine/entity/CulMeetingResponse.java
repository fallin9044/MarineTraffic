package com.marine.entity;

import java.util.List;

public class CulMeetingResponse{
	Integer SimpleMeeting ; //简单会遇数目
	Integer ComplexMeeting ; //复杂会遇数目
	Integer SimpleDamageMeeting ; //简单危险会遇数目
	Integer ComplexDamageMeeting ; //复杂危险会遇数目
	Integer ForecastDamageMeeting ; //预测危险会遇数目
	Integer DamageMeetingAvoid ; //危险会遇规避数目
	List<Integer> AngleForecastDamageMeeting ; //各个角度预测危险会遇数目
	List<Integer> AngleDamageMeetingAvoid ; //各个角度危险会遇规避数目

	public Integer getSimpleMeeting() {
		return SimpleMeeting;
	}

	public void setSimpleMeeting(Integer simpleMeeting) {
		SimpleMeeting = simpleMeeting;
	}

	public Integer getComplexMeeting() {
		return ComplexMeeting;
	}

	public void setComplexMeeting(Integer complexMeeting) {
		ComplexMeeting = complexMeeting;
	}

	public Integer getSimpleDamageMeeting() {
		return SimpleDamageMeeting;
	}

	public void setSimpleDamageMeeting(Integer simpleDamageMeeting) {
		SimpleDamageMeeting = simpleDamageMeeting;
	}

	public Integer getComplexDamageMeeting() {
		return ComplexDamageMeeting;
	}

	public void setComplexDamageMeeting(Integer complexDamageMeeting) {
		ComplexDamageMeeting = complexDamageMeeting;
	}

	public Integer getForecastDamageMeeting() {
		return ForecastDamageMeeting;
	}

	public void setForecastDamageMeeting(Integer forecastDamageMeeting) {
		ForecastDamageMeeting = forecastDamageMeeting;
	}

	public Integer getDamageMeetingAvoid() {
		return DamageMeetingAvoid;
	}

	public void setDamageMeetingAvoid(Integer damageMeetingAvoid) {
		DamageMeetingAvoid = damageMeetingAvoid;
	}

	public List<Integer> getAngleForecastDamageMeeting() {
		return AngleForecastDamageMeeting;
	}

	public void setAngleForecastDamageMeeting(List<Integer> angleForecastDamageMeeting) {
		AngleForecastDamageMeeting = angleForecastDamageMeeting;
	}

	public List<Integer> getAngleDamageMeetingAvoid() {
		return AngleDamageMeetingAvoid;
	}

	public void setAngleDamageMeetingAvoid(List<Integer> angleDamageMeetingAvoid) {
		AngleDamageMeetingAvoid = angleDamageMeetingAvoid;
	}
}
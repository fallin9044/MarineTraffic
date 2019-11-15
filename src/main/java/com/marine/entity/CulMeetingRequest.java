package com.marine.entity;

public class CulMeetingRequest{

	Data StartTime ; //起始时间
	Data EndTime ; //终止时间
	Data DeltaT ; //时间范围
	Data TimeRange ; //时间精度

	public Data getStartTime() {
		return StartTime;
	}

	public void setStartTime(Data startTime) {
		StartTime = startTime;
	}

	public Data getEndTime() {
		return EndTime;
	}

	public void setEndTime(Data endTime) {
		EndTime = endTime;
	}

	public Data getDeltaT() {
		return DeltaT;
	}

	public void setDeltaT(Data deltaT) {
		DeltaT = deltaT;
	}

	public Data getTimeRange() {
		return TimeRange;
	}

	public void setTimeRange(Data timeRange) {
		TimeRange = timeRange;
	}
}
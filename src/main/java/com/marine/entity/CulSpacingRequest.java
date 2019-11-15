package com.marine.entity;

public class CulSpacingRequest{

	Data Time ; //时间
	Data DeltaT ; //时间范围

	public Data getTime() {
		return Time;
	}

	public void setTime(Data time) {
		Time = time;
	}

	public Data getDeltaT() {
		return DeltaT;
	}

	public void setDeltaT(Data deltaT) {
		DeltaT = deltaT;
	}
}
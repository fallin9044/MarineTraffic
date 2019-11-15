package com.marine.entity;

public class CulDoorLineRequest{

	Position StartPosition ; //门线起点
	Position EndPosition ; //门线终点
	Data StartTime ; //起始时间
	Data EndTime ; //终止时间

	public Position getStartPosition() {
		return StartPosition;
	}

	public void setStartPosition(Position startPosition) {
		StartPosition = startPosition;
	}

	public Position getEndPosition() {
		return EndPosition;
	}

	public void setEndPosition(Position endPosition) {
		EndPosition = endPosition;
	}

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
}
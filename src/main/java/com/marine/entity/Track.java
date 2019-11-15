package com.marine.entity;

import java.util.List;

public class Track{
	Position PrePosition ; //之前位置
	Boolean DeWeightDoorLine ; //判断是否过门线
	Data Time ; //当前时间
	Integer Deviation ; //当前时间精度
	Double COG ; //船舶COG
	Double SOG ; //船舶SOG
	List<Position> TrackList ; //船舶航迹

	public Position getPrePosition() {
		return PrePosition;
	}

	public void setPrePosition(Position prePosition) {
		PrePosition = prePosition;
	}

	public Boolean getDeWeightDoorLine() {
		return DeWeightDoorLine;
	}

	public void setDeWeightDoorLine(Boolean deWeightDoorLine) {
		DeWeightDoorLine = deWeightDoorLine;
	}

	public Data getTime() {
		return Time;
	}

	public void setTime(Data time) {
		Time = time;
	}

	public Integer getDeviation() {
		return Deviation;
	}

	public void setDeviation(Integer deviation) {
		Deviation = deviation;
	}

	public Double getCOG() {
		return COG;
	}

	public void setCOG(Double COG) {
		this.COG = COG;
	}

	public Double getSOG() {
		return SOG;
	}

	public void setSOG(Double SOG) {
		this.SOG = SOG;
	}

	public List<Position> getTrackList() {
		return TrackList;
	}

	public void setTrackList(List<Position> trackList) {
		TrackList = trackList;
	}
}
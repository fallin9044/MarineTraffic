package com.marine.entity;

public class CulDoorLineResponse{

	Integer Cnt ; //过门线总数
	Integer DeWeightingCnt ; //去重后过门线总数

	public Integer getCnt() {
		return Cnt;
	}

	public void setCnt(Integer cnt) {
		Cnt = cnt;
	}

	public Integer getDeWeightingCnt() {
		return DeWeightingCnt;
	}

	public void setDeWeightingCnt(Integer deWeightingCnt) {
		DeWeightingCnt = deWeightingCnt;
	}
}
package com.marine.entity;

import java.util.List;

public class CleaningAndRepairPositionMetaResponse{

	List<PositionMeta> DataList ;

	public CleaningAndRepairPositionMetaResponse(List<PositionMeta> dataList) {
		DataList = dataList;
	}

	public List<PositionMeta> getDataList() {
		return DataList;
	}

	public void setDataList(List<PositionMeta> dataList) {
		DataList = dataList;
	}
}
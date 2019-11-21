package com.marine.entity;

import java.util.List;

public class SaveCleanDataRequest{
	List<PositionMeta> DataList ;

	public SaveCleanDataRequest(List<PositionMeta> dataList) {
		DataList = dataList;
	}

	public List<PositionMeta> getDataList() {
		return DataList;
	}

	public void setDataList(List<PositionMeta> dataList) {
		DataList = dataList;
	}
}
package com.marine.entity;

public class CleaningAndRepairPositionMetaRequest {
    PositionMeta[] DataList;
    PositionMeta PrePosition;

    public PositionMeta[] getDataList() {
        return DataList;
    }

    public void setDataList(PositionMeta[] dataList) {
        DataList = dataList;
    }

    public PositionMeta getPrePosition() {
        return PrePosition;
    }

    public void setPrePosition(PositionMeta prePosition) {
        PrePosition = prePosition;
    }
}
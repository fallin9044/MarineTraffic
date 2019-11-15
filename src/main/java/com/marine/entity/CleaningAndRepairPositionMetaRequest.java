package com.marine.entity;

import java.util.List;

public class CleaningAndRepairPositionMetaRequest {
    List<PositionMeta> DataList;
    PositionMeta PrePosition;

    public CleaningAndRepairPositionMetaRequest(List<PositionMeta> dataList, PositionMeta prePosition) {
        DataList = dataList;
        PrePosition = prePosition;
    }

    public List<PositionMeta> getDataList() {
        return DataList;
    }

    public void setDataList(List<PositionMeta> dataList) {
        DataList = dataList;
    }

    public PositionMeta getPrePosition() {
        return PrePosition;
    }

    public void setPrePosition(PositionMeta prePosition) {
        PrePosition = prePosition;
    }
}
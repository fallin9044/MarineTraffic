package com.marine.service;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 08:54
 * @Description:
 */
public interface cleanRepairService {

    /**
     * @return void
     * @Author cuishuyang
     * @Description
     * @Date 8:55 上午 2019/11/15
     * @Param [fileName]
     **/
    public void innitWriter(String fileName);

    /**
     * @return void
     * @Author cuishuyang
     * @Description
     * @Date 8:56 上午 2019/11/15
     * @Param [shipID]
     **/
    public void cleanShip(int shipID);

    /**
     * @return PositionMeta[]
     * @Author cuishuyang
     * @Description
     * @Date 8:59 上午 2019/11/15
     * @Param [rawData, preData]
     **/
    public PositionMeta[] cleanData(PositionMeta[] rawData, PositionMeta preData);

    /**
     * @return PositionMeta[]
     * @Author cuishuyang
     * @Description
     * @Date 9:00 上午 2019/11/15
     * @Param [cleaData]
     **/
    public PositionMeta[] repairData(PositionMeta[] cleaData);

    /**
     * @return CleaningAndRepairPositionMetaResponse
     * @Author cuishuyang
     * @Description 清洗和修复数据
     * @Date 9:01 上午 2019/11/15
     * @Param [request]
     **/
    public CleaningAndRepairPositionMetaResponse cleaningAndRepairPositionMeta(CleaningAndRepairPositionMetaRequest request);

    /**
         * @Author cuishuyang
         * @Description 清洗程序
         * @Date 9:05 上午 2019/11/15
         * @Param []
         * @return void
    **/
    public void DataClean();


}

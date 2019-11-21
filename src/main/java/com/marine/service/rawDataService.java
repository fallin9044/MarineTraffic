package com.marine.service;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 09:35
 * @Description:
 */
public interface rawDataService {

    /**
     * @return void
     * @Author cuishuyang
     * @Description
     * @Date 9:36 上午 2019/11/15
     * @Param [fileName]
     **/
    public void CreateRawData(String fileName);

    /**
     * @return void
     * @Author cuishuyang
     * @Description
     * @Date 9:37 上午 2019/11/15
     * @Param [fileName]
     **/
    public void CleanRawData(String fileName);

    /**
         * @Author cuishuyang
         * @Description
         * @Date 9:38 上午 2019/11/15
         * @Param [fileName]
         * @return void
    **/
    public void ZhangCleanRawData(String fileName);

    /**
         * @Author cuishuyang
         * @Description
         * @Date 9:39 上午 2019/11/15
         * @Param [fileName]
         * @return void
    **/
    public void RepairCleanData(String fileName);

    /**
         * @Author cuishuyang
         * @Description
         * @Date 9:40 上午 2019/11/15
         * @Param [createFile, cleanFile, repairFile]
         * @return void
    **/
    public void CulDeviation(String createFile, String cleanFile, String repairFile);
}

package com.marine.service;

import com.marine.entity.PositionMeta;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 09:58
 * @Description:
 */
public interface zhangmodelService {

    /**
     * @return java.lang.Boolean
     * @Author cuishuyang
     * @Description
     * @Date 10:01 上午 2019/11/15
     * @Param [position, prePosition]
     **/
    public Boolean movingAvailable(PositionMeta position, PositionMeta prePosition);

    /**
     * @return java.lang.Boolean
     * @Author cuishuyang
     * @Description
     * @Date 10:01 上午 2019/11/15
     * @Param [position, prePosition]
     **/
    public Boolean speedAvailable(PositionMeta position, PositionMeta prePosition);

    /**
     * @return java.lang.Boolean
     * @Author cuishuyang
     * @Description
     * @Date 10:02 上午 2019/11/15
     * @Param [position, prePosition]
     **/
    public Boolean driftAvailable(PositionMeta position, PositionMeta prePosition);

    /**
     * @return java.lang.Boolean
     * @Author cuishuyang
     * @Description
     * @Date 10:03 上午 2019/11/15
     * @Param [position, prePosition]
     **/
    public Boolean accelerationAvailable(PositionMeta position, PositionMeta prePosition);

    /**
     * @return java.lang.Boolean
     * @Author cuishuyang
     * @Description
     * @Date 10:04 上午 2019/11/15
     * @Param [position, prePOsition]
     **/
    public Boolean rateAvailable(PositionMeta position, PositionMeta prePOsition);

    /**
     * @return java.lang.Boolean
     * @Author cuishuyang
     * @Description
     * @Date 10:05 上午 2019/11/15
     * @Param [position, prePosition]
     **/
    public Boolean PositionAvailable(PositionMeta position, PositionMeta prePosition);

    /**
         * @Author cuishuyang
         * @Description
         * @Date 10:07 上午 2019/11/15
         * @Param [fileName]
         * @return void
    **/
    public void ZhangDataAvailable(String fileName);
}

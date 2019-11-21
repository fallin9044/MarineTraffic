package com.marine.mapservice;

import com.marine.mapentity.HeatPosition;

import java.util.List;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/20 15:52
 * @Description:
 */
public interface MapService {

    /**
         * @Author cuishuyang
         * @Description
         * @Date 8:44 下午 2019/11/20
         * @Param [url]
         * @return java.util.List<com.marine.mapentity.HeatPosition>
    **/
    public List<HeatPosition> HeatMap(String url);
}

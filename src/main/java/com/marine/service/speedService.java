package com.marine.service;

import com.marine.entity.CulSpeedRequest;
import com.marine.entity.CulSpeedResponse;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 09:52
 * @Description:
 */
public interface speedService {

    /**
         * @Author cuishuyang
         * @Description
         * @Date 9:52 上午 2019/11/15
         * @Param [request]
         * @return com.marine.entity.CulSpeedResponse
    **/
    public CulSpeedResponse CulSpeed(CulSpeedRequest request);
}

package com.marine.service;

import com.marine.entity.CulDensityRequest;
import com.marine.entity.CulDensityResponse;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 09:13
 * @Description:
 */
public interface densityService {

    /**
         * @Author cuishuyang
         * @Description 计算船舶密度
         * @Date 9:14 上午 2019/11/15
         * @Param [request]
         * @return CulDensityResponse
    **/
    public CulDensityResponse CulDensity(CulDensityRequest request);

}

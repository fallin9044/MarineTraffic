package com.marine.service;

import com.marine.entity.CulSpacingRequest;
import com.marine.entity.CulSpacingResponse;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 09:50
 * @Description:
 */
public interface spacingService {

    /**
         * @Author cuishuyang
         * @Description
         * @Date 9:51 上午 2019/11/15
         * @Param [request]
         * @return com.marine.entity.CulSpacingResponse
    **/
    public CulSpacingResponse CulSpacing(CulSpacingRequest request);
}

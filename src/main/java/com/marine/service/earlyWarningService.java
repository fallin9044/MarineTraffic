package com.marine.service;

import com.marine.entity.EarlyWarningRequest;
import com.marine.entity.EarlyWarningResponse;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 09:17
 * @Description:
 */
public interface earlyWarningService {

    /**
         * @Author cuishuyang
         * @Description
         * @Date 9:18 上午 2019/11/15
         * @Param [request]
         * @return EarlyWarningResponse
    **/
    public EarlyWarningResponse EarlyWarning(EarlyWarningRequest request);

}

package com.marine.service;

import com.marine.entity.CulDoorLineRequest;
import com.marine.entity.CulDoorLineResponse;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 09:15
 * @Description:
 */
public interface doorLineService {

    /**
     * @return CulDoorLineResponse
     * @Author cuishuyang
     * @Description 计算门线通过次数
     * @Date 9:16 上午 2019/11/15
     * @Param [request]
     **/
    public CulDoorLineResponse CulDoorLine(CulDoorLineRequest request);
}

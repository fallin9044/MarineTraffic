package com.marine.service;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 09:53
 * @Description:
 */

import com.marine.entity.CulTrafficRequest;
import com.marine.entity.CulTrafficResponse;

/**
	计算交通量
		计算维度：
			区域流量（10x10）
			小时流量
			船舶类型流量：
				0：	渔船
				6x:	客轮
				7x:	货轮
				8x:	油轮
			船舶大小：
				小型船:	length < 100m
				大型船:	length >= 100m
*/
public interface trafficService {

    /**
     * @return com.marine.entity.CulTrafficResponse
     * @Author cuishuyang
     * @Description
     * @Date 9:54 上午 2019/11/15
     * @Param [request]
     **/
    public CulTrafficResponse CulTraffic(CulTrafficRequest request);

    /**
         * @Author cuishuyang
         * @Description
         * @Date 9:55 上午 2019/11/15
         * @Param [request]
         * @return com.marine.entity.CulTrafficResponse
    **/
    public CulTrafficResponse CulNewTraffic(CulTrafficRequest request);
}

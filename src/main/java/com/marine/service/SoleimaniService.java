package com.marine.service;

import com.marine.entity.PositionMeta;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 09:43
 * @Description:
 */
public interface SoleimaniService {
    
    /**
         * @Author cuishuyang
         * @Description
         * @Date 9:48 上午 2019/11/15
         * @Param [positions]
         * @return void
    **/
    public void curLAG(PositionMeta[] positions);

    /**
         * @Author cuishuyang
         * @Description
         * @Date 9:49 上午 2019/11/15
         * @Param [reFIle, opFIle]
         * @return void
    **/
    public void Soleimani(String reFIle, String opFIle);
}

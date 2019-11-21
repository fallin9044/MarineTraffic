package com.marine.service.Impl;

import com.marine.entity.PositionMeta;
import com.marine.service.zhangmodelService;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 10:08
 * @Description:
 */
public class ZhangmodelServiceImpl implements zhangmodelService {
    @Override
    public Boolean movingAvailable(PositionMeta position, PositionMeta prePosition) {
        if(position.getLongitude().equals(prePosition.getLongitude())&&position.getLatitude().equals(prePosition.getLatitude())&&prePosition.getSOG() > 2){
            System.out.println("moving" + prePosition + position);
            return false;
        }
        return true;
    }

    @Override
    public Boolean speedAvailable(PositionMeta position, PositionMeta prePosition) {
        if(position.getSOG() > 16){
            return false;
        }
        return true;
    }

    @Override
    public Boolean driftAvailable(PositionMeta position, PositionMeta prePosition) {
        return false;
    }

    @Override
    public Boolean accelerationAvailable(PositionMeta position, PositionMeta prePosition) {
        return null;
    }

    @Override
    public Boolean rateAvailable(PositionMeta position, PositionMeta prePOsition) {
        return null;
    }

    @Override
    public Boolean PositionAvailable(PositionMeta position, PositionMeta prePosition) {
        return null;
    }

    @Override
    public void ZhangDataAvailable(String fileName) {

    }
}

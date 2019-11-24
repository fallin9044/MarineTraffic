package com.marine.mapentity;

import java.io.Serializable;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/20 19:11
 * @Description:
 */
public class HeatPosition implements Serializable {

    private double lng;
    private double lat;
    private int count;

    public HeatPosition(double lng, double lat, int count) {
        this.lng = lng;
        this.lat = lat;
        this.count = count;
    }

    public HeatPosition() {
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

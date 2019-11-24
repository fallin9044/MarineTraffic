package com.marine.mapentity;

import java.io.Serializable;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/23 13:37
 * @Description:
 */
public class Trajectory implements Serializable {

    private double lng;
    private double lat;

    public Trajectory() {
    }

    public Trajectory(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
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
}

package com.marine.mapentity;

import java.io.Serializable;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/22 18:45
 * @Description:
 */
public class DoorLine implements Serializable {

    private static final long serialVersionUID = 1L;

    private double lng;
    private double lat;

    public DoorLine(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }

    public DoorLine() {
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

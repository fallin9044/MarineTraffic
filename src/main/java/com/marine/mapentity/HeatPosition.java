package com.marine.mapentity;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/20 19:11
 * @Description:
 */
public class HeatPosition {

    private double longitude;
    private double latitude;

    public HeatPosition() {
    }

    public HeatPosition(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}

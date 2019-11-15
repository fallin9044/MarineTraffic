package com.marine.entity;

import java.util.Map;

public class AreaTraffic {
    Map<Integer, Integer> ShipMap; //区域内船舶map->日流量
    Integer Traffic; //区域内流量->日流量和
    Map<Integer, Integer>[] HourShipMap; //区域内各小时船舶map->小时流量
    Integer[] HourTraffic; //区域内小时流量->小时流量和
    Map<Integer, Integer> SmallShipMap; //区域内小船map->日小船流量
    Integer SmallShipTraffic; //区域内小船流量->日小船流量和
    Map<Integer, Integer>[] HourSmallShipMap; //区域内各小时小船map->小时小船流量
    Integer[] HourSmallShipTraffic; //区域内小时小船流量->小时小船流量和
    Map<Integer, Integer> BigShipMap; //区域内大船map->日大船流量
    Integer BigShipTraffic; //区域内大船流量->日大船流量和
    Map<Integer, Integer>[] HourBigShipMap; //区域内各小时大船map->小时大船流量
    Integer[] HourBigShipTraffic; //区域内小时大船流量->小时大船流量和
    Map<Integer, Integer> Type0ShipMap; //渔船map
    Integer Type0ShipTraffic; //渔船交通量
    Map<Integer, Integer>[] HourType0ShipMap; //渔船小时map
    Integer[] HourType0ShipTraffic; //渔船小时交通量
    Map<Integer, Integer> Type6xShipMap; //客船map
    Integer Type6xShipTraffic; //客船交通量
    Map<Integer, Integer>[] HourType6xShipMap; //客船小时map
    Integer[] HourType6xShipTraffic; //客船小时交通量
    Map<Integer, Integer> Type7xShipMap; //货轮map
    Integer Type7xShipTraffic; //货轮交通量
    Map<Integer, Integer>[] HourType7xShipMap; //货轮小时map
    Integer[] HourType7xShipTraffic; //货轮小时交通量
    Map<Integer, Integer> Type8xShipMap; //油轮map
    Integer Type8xShipTraffic; //油轮交通量
    Map<Integer, Integer>[] HourType8xShipMap; //油轮小时map
    Integer[] HourType8xShipTraffic; //油轮小时交通量
    Integer OtherTypeShipTraffic;
    Integer[] HourOtherTypeShipTraffic;

    public Map<Integer, Integer> getShipMap() {
        return ShipMap;
    }

    public void setShipMap(Map<Integer, Integer> shipMap) {
        ShipMap = shipMap;
    }

    public Integer getTraffic() {
        return Traffic;
    }

    public void setTraffic(Integer traffic) {
        Traffic = traffic;
    }

    public Map<Integer, Integer>[] getHourShipMap() {
        return HourShipMap;
    }

    public void setHourShipMap(Map<Integer, Integer>[] hourShipMap) {
        HourShipMap = hourShipMap;
    }

    public Integer[] getHourTraffic() {
        return HourTraffic;
    }

    public void setHourTraffic(Integer[] hourTraffic) {
        HourTraffic = hourTraffic;
    }

    public Map<Integer, Integer> getSmallShipMap() {
        return SmallShipMap;
    }

    public void setSmallShipMap(Map<Integer, Integer> smallShipMap) {
        SmallShipMap = smallShipMap;
    }

    public Integer getSmallShipTraffic() {
        return SmallShipTraffic;
    }

    public void setSmallShipTraffic(Integer smallShipTraffic) {
        SmallShipTraffic = smallShipTraffic;
    }

    public Map<Integer, Integer>[] getHourSmallShipMap() {
        return HourSmallShipMap;
    }

    public void setHourSmallShipMap(Map<Integer, Integer>[] hourSmallShipMap) {
        HourSmallShipMap = hourSmallShipMap;
    }

    public Integer[] getHourSmallShipTraffic() {
        return HourSmallShipTraffic;
    }

    public void setHourSmallShipTraffic(Integer[] hourSmallShipTraffic) {
        HourSmallShipTraffic = hourSmallShipTraffic;
    }

    public Map<Integer, Integer> getBigShipMap() {
        return BigShipMap;
    }

    public void setBigShipMap(Map<Integer, Integer> bigShipMap) {
        BigShipMap = bigShipMap;
    }

    public Integer getBigShipTraffic() {
        return BigShipTraffic;
    }

    public void setBigShipTraffic(Integer bigShipTraffic) {
        BigShipTraffic = bigShipTraffic;
    }

    public Map<Integer, Integer>[] getHourBigShipMap() {
        return HourBigShipMap;
    }

    public void setHourBigShipMap(Map<Integer, Integer>[] hourBigShipMap) {
        HourBigShipMap = hourBigShipMap;
    }

    public Integer[] getHourBigShipTraffic() {
        return HourBigShipTraffic;
    }

    public void setHourBigShipTraffic(Integer[] hourBigShipTraffic) {
        HourBigShipTraffic = hourBigShipTraffic;
    }

    public Map<Integer, Integer> getType0ShipMap() {
        return Type0ShipMap;
    }

    public void setType0ShipMap(Map<Integer, Integer> type0ShipMap) {
        Type0ShipMap = type0ShipMap;
    }

    public Integer getType0ShipTraffic() {
        return Type0ShipTraffic;
    }

    public void setType0ShipTraffic(Integer type0ShipTraffic) {
        Type0ShipTraffic = type0ShipTraffic;
    }

    public Map<Integer, Integer>[] getHourType0ShipMap() {
        return HourType0ShipMap;
    }

    public void setHourType0ShipMap(Map<Integer, Integer>[] hourType0ShipMap) {
        HourType0ShipMap = hourType0ShipMap;
    }

    public Integer[] getHourType0ShipTraffic() {
        return HourType0ShipTraffic;
    }

    public void setHourType0ShipTraffic(Integer[] hourType0ShipTraffic) {
        HourType0ShipTraffic = hourType0ShipTraffic;
    }

    public Map<Integer, Integer> getType6xShipMap() {
        return Type6xShipMap;
    }

    public void setType6xShipMap(Map<Integer, Integer> type6xShipMap) {
        Type6xShipMap = type6xShipMap;
    }

    public Integer getType6xShipTraffic() {
        return Type6xShipTraffic;
    }

    public void setType6xShipTraffic(Integer type6xShipTraffic) {
        Type6xShipTraffic = type6xShipTraffic;
    }

    public Map<Integer, Integer>[] getHourType6xShipMap() {
        return HourType6xShipMap;
    }

    public void setHourType6xShipMap(Map<Integer, Integer>[] hourType6xShipMap) {
        HourType6xShipMap = hourType6xShipMap;
    }

    public Integer[] getHourType6xShipTraffic() {
        return HourType6xShipTraffic;
    }

    public void setHourType6xShipTraffic(Integer[] hourType6xShipTraffic) {
        HourType6xShipTraffic = hourType6xShipTraffic;
    }

    public Map<Integer, Integer> getType7xShipMap() {
        return Type7xShipMap;
    }

    public void setType7xShipMap(Map<Integer, Integer> type7xShipMap) {
        Type7xShipMap = type7xShipMap;
    }

    public Integer getType7xShipTraffic() {
        return Type7xShipTraffic;
    }

    public void setType7xShipTraffic(Integer type7xShipTraffic) {
        Type7xShipTraffic = type7xShipTraffic;
    }

    public Map<Integer, Integer>[] getHourType7xShipMap() {
        return HourType7xShipMap;
    }

    public void setHourType7xShipMap(Map<Integer, Integer>[] hourType7xShipMap) {
        HourType7xShipMap = hourType7xShipMap;
    }

    public Integer[] getHourType7xShipTraffic() {
        return HourType7xShipTraffic;
    }

    public void setHourType7xShipTraffic(Integer[] hourType7xShipTraffic) {
        HourType7xShipTraffic = hourType7xShipTraffic;
    }

    public Map<Integer, Integer> getType8xShipMap() {
        return Type8xShipMap;
    }

    public void setType8xShipMap(Map<Integer, Integer> type8xShipMap) {
        Type8xShipMap = type8xShipMap;
    }

    public Integer getType8xShipTraffic() {
        return Type8xShipTraffic;
    }

    public void setType8xShipTraffic(Integer type8xShipTraffic) {
        Type8xShipTraffic = type8xShipTraffic;
    }

    public Map<Integer, Integer>[] getHourType8xShipMap() {
        return HourType8xShipMap;
    }

    public void setHourType8xShipMap(Map<Integer, Integer>[] hourType8xShipMap) {
        HourType8xShipMap = hourType8xShipMap;
    }

    public Integer[] getHourType8xShipTraffic() {
        return HourType8xShipTraffic;
    }

    public void setHourType8xShipTraffic(Integer[] hourType8xShipTraffic) {
        HourType8xShipTraffic = hourType8xShipTraffic;
    }

    public Integer getOtherTypeShipTraffic() {
        return OtherTypeShipTraffic;
    }

    public void setOtherTypeShipTraffic(Integer otherTypeShipTraffic) {
        OtherTypeShipTraffic = otherTypeShipTraffic;
    }

    public Integer[] getHourOtherTypeShipTraffic() {
        return HourOtherTypeShipTraffic;
    }

    public void setHourOtherTypeShipTraffic(Integer[] hourOtherTypeShipTraffic) {
        HourOtherTypeShipTraffic = hourOtherTypeShipTraffic;
    }
}
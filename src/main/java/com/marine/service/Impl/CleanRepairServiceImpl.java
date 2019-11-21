package com.marine.service.Impl;

import com.marine.entity.CleaningAndRepairPositionMetaRequest;
import com.marine.entity.CleaningAndRepairPositionMetaResponse;
import com.marine.entity.Data;
import com.marine.entity.PositionMeta;
import com.marine.service.cleanRepairService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class CleanRepairServiceImpl implements cleanRepairService {
    File file = null;
    BufferedWriter bufferedWriter = null;
    @Override
    public void innitWriter(String fileName){
        file = new File("data/"+fileName+"txt");
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cleanShip(int shipID) {
// 从数据库中读取数据
//        List<PositionMeta> positions = SQL.getPositionsWithShipId(shipID);
//        if(positions==null||positions.size()==0)return;
//        int length = positions.size();
//
//        List<Integer> ignore =new ArrayList<Integer>();
//        List<Integer> ends = new ArrayList<Integer>();
//        boolean signal = true;
//        PositionMeta prePosition = new PositionMeta();
//        int index = 0;
//        while(index<length){
//            int start = index;
//            for(;start<length;start++){
//                if(signal){
//                    prePosition = positions.get(start);
//                    signal = false;
//                    continue;
//                }
//                int rg = helper.timeDevition(new Data(positions.get(start)),new Data(prePosition));
//                if (rg <= 0) {
//                    // 忽略时间错位数据
//                    ignore.add(start);
//                } else {
//                    prePosition = positions.get(start);
//                    if(rg > 5*60) {
//                        // 间隔时间大于5分钟，区分之
//                        ends.add(start);
//                        signal = true;
//                        break;
//                    }
//                }
//            }
//            index = start;
//        }
//        // 分段清洗
//        int start = 0;
//        int cnt = 1;
//        int ignoreIndex = 0;
//        PositionMeta preData = new PositionMeta();
//        preData.setID(-1);
//        for(Integer v:ends){
//            //log.Println("index:", cnt)
//            ArrayList<PositionMeta> dataList = new ArrayList<PositionMeta>();
//            for( int i = start; i < v; i++ ){
//                if (ignoreIndex < ignore.size() && i == ignore.get(ignoreIndex)){
//                    ignoreIndex += 1;
//                    continue;
//                }
//                dataList.add(positions.get(i));
//            }
//            CleaningAndRepairPositionMetaResponse response = cleaningAndRepairPositionMeta(new CleaningAndRepairPositionMetaRequest(dataList,preData));
//            if( response.getDataList().size() > 0) {
//                preData = response.getDataList().get(response.getDataList().size()-1);
//            }
//            saveCleanData(new SaveCleanDataRequest(response.getDataList()));
//            start = v;
//            cnt += 1;
//        }
//        if (start < length) {
//            List<PositionMeta> dataList = new ArrayList<PositionMeta>();
//            for (int i=start; i < length; i++) {
//                if (ignoreIndex < ignore.size() && i == ignore.get(ignoreIndex)) {
//                    ignoreIndex += 1;
//                    continue;
//                }
//                dataList.add(positions.get(i));
//            }
//            CleaningAndRepairPositionMetaResponse response= cleaningAndRepairPositionMeta(new CleaningAndRepairPositionMetaRequest(dataList,preData));
//            saveCleanData(new SaveCleanDataRequest(response.getDataList()));
//        }
    }

    @Override
    public List<PositionMeta> cleanData(List<PositionMeta> rawData, PositionMeta preData) {
//        int length = rawData.size();
//        List<Integer> ignore = new ArrayList<Integer>();
//        int start = 0;
//        PositionMeta prePosition = rawData.get(0);
//        List<PositionMeta> cleanData = new ArrayList<PositionMeta>();
//        cleanData.add(prePosition);
//        if (length <= 3) {
//            return new ArrayList<PositionMeta>();
//            ////log.Println("one point judge", preData)
//            //if preData.ID != -1 && helper.PositionAvailable(rawData[0], preData) == false {
//            //	log.Println("one point unavailable")
//            //	return []constant.PositionMeta{}
//            //} else {
//            //	log.Println("ok")
//            //	return rawData
//            //}
//        }
//        // 起点适用性判断 仅当长度大于等于3时判断
//        if(length >= 3 && helper.PositionAvailable(rawData.get(1), rawData.get(0)) == false) {
//            if(helper.PositionAvailable(rawData.get(2), rawData.get(1)) == true){
//                // 第一个点为异常点，抛弃
//                start = 1;
//                ignore.add(0);
//                cleanData.set(0,prePosition);
//                prePosition = rawData.get(1);
//            }
//        }
//        for(int i = start + 1; i < length; i++ ){
//            if (helper.PositionAvailable(rawData.get(i), prePosition) == false){
//                ignore.add(i);
//                continue;
//            }
//            prePosition = rawData.get(i);
//            cleanData.add(prePosition);
//        }
//        return cleanData;
        return null;
    }

    @Override
    public List<PositionMeta> repairData(List<PositionMeta> cleanData) {
//        if(cleanData.size() == 0){
//            return new ArrayList<>();
//        }
//        List<PositionMeta> repairData = new ArrayList<>();
//        LinkedList<PositionMeta> beforeList = new LinkedList<>(); // 前队列
//        PositionMeta prePosition = cleanData.get(0);
//        int cleanLength =cleanData.size();
//        beforeList.addLast(prePosition);
//        repairData.add(prePosition);
//        for(int i = 1; i < cleanLength; i++){
//            PositionMeta nowPosition = cleanData.get(i);
//            Data nowTime = new Data(nowPosition);
//            Data preTime = new Data(prePosition);
//            int diff = helper.TimeDeviation(nowTime, preTime);
//            if(diff <= 30){
//                if(beforeList.size() == 3){
//                    beforeList.removeFirst();
//                }
//                beforeList.addLast(nowPosition);
//                prePosition = nowPosition;
//                repairData.add(prePosition);
//            } else {
//                LinkedList<PositionMeta> afterList = new LinkedList<>();
//                for(int start = i; start < cleanLength; start++) {
//                    if (afterList.size() == 3) {
//                        break;
//                    }
//                    afterList.addLast(cleanData.get(start));
//                }
//
//                List<Double> x = new ArrayList<>();
//                List<Double> longitudeY = new ArrayList<>();
//                List<Double> latitudeY = new ArrayList<>();
//                List<Double> cogY = new ArrayList<>();
//                List<Double> sogY = new ArrayList<>();
//                Double preCOG = beforeList.getFirst().getCOG();
//                Iterator<PositionMeta> iterator = beforeList.iterator();
//                while(iterator.hasNext()){
//                    PositionMeta position = iterator.next();
//                    int diffX = helper.TimeDeviation(new Data(position), preTime);
//
//                    x.add((double)diffX);
//                    longitudeY.add(position.getLongitude());
//                    latitudeY.add(position.getLatitude());
//                    cogY.add(helper.RateRange(position.getCOG(), preCOG));
//                    sogY.add(position.getSOG());
//                }
//                iterator = afterList.iterator();
//                while(iterator.hasNext()){
//                    PositionMeta position = iterator.next();
//                    int diffX = helper.TimeDeviation(new Data(position), preTime);
//
//                    x.add((double)diffX);
//                    longitudeY.add(position.getLongitude());
//                    latitudeY.add(position.getLatitude());
//                    cogY.add(helper.RateRange(position.getCOG(), preCOG));
//                    sogY.add(position.getSOG());
//                }
//
//                //fmt.Println("x", x)
//                //fmt.Println("longitudeY", longitudeY)
//                //fmt.Println("latitudeY", latitudeY)
//                //fmt.Println("cogY", cogY)
//                //fmt.Println("sogY", sogY)
//
//                longitudeFunc := gospline.NewCubicSpline(x, longitudeY)
//                latitudeFunc := gospline.NewCubicSpline(x, latitudeY)
//                cogFunc := gospline.NewCubicSpline(x, cogY)
//                sogFunc := gospline.NewCubicSpline(x, sogY)
//
//                need := (int(diff) - 1) / 30
//                baseTime := time.Date(preTime.Year, time.Month(preTime.Month), preTime.Day, preTime.Hour, preTime.Minute, preTime.Second, 0, time.UTC)
//                //fmt.Println("=============")
//                //fmt.Println(prePosition)
//                //fmt.Println(nowPosition)
//                for j := 0; j < need; j++ {
//                    add := (j + 1) * int(diff) / (need + 1)
//                    resultTime := baseTime.Add(time.Duration(add) * time.Second)
//                    //fmt.Println(baseTime, resultTime, add)
//                    longitude := longitudeFunc.At(float64(add))
//                    latitude := latitudeFunc.At(float64(add))
//                    cog := cogFunc.At(float64(add)) + preCOG
//                    sog := sogFunc.At(float64(add))
//                    sog = math.Max(0, sog)
//                    if cog < 0 {
//                        cog = cog - float64(int(cog/360)-1)*360.0
//                    } else if cog > 360 {
//                        cog = cog - float64(int(cog/360))*360.0
//                    }
//                    position := constant.PositionMeta{
//                        MMSI:      prePosition.MMSI,
//                                SOG:       sog,
//                                COG:       cog,
//                                Longitude: longitude,
//                                Latitude:  latitude,
//                                Year:      resultTime.Year(),
//                                Month:     int(resultTime.Month()),
//                                Day:       resultTime.Day(),
//                                Hour:      resultTime.Hour(),
//                                Minute:    resultTime.Minute(),
//                                Second:    resultTime.Second(),
//                    }
//                    if beforeList.Len() == 3 {
//                        beforeList.Remove(beforeList.Front())
//                    }
//                    beforeList.PushBack(position)
//                    prePosition = position
//                    repairData = append(repairData, prePosition)
//                    //fmt.Println(position)
//                }
//                prePosition = nowPosition
//                repairData = append(repairData, prePosition)
//            }
//        }
        //return repairData
        return null;
    }

    @Override
    public CleaningAndRepairPositionMetaResponse cleaningAndRepairPositionMeta(CleaningAndRepairPositionMetaRequest request) {
        return null;
    }

    @Override
    public void DataClean() {

    }

    public int timeDevition(Data d1,Data d2){
        Date date1 = new Date(d1.getYear(),d1.getMonth(),d1.getDay(),d1.getHour(),d1.getMinute(),d1.getSecond());
        Date date2 = new Date(d2.getYear(),d2.getMonth(),d2.getDay(),d2.getHour(),d2.getMinute(),d2.getSecond());
        String timestamp = String.valueOf((date1.getTime()-date2.getTime())/1000);
        return Integer.valueOf(timestamp);
    }
}

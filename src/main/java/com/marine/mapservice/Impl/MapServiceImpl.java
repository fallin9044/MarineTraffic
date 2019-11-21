package com.marine.mapservice.Impl;

import com.marine.mapentity.HeatPosition;
import com.marine.mapservice.MapService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/20 20:41
 * @Description:
 */
public class MapServiceImpl implements MapService {

    @Override
    public List<HeatPosition> HeatMap(String url) {

        List<HeatPosition> positions = new ArrayList<>();

        //测试用
        url = "src/main/resources/data/danger1.txt";
        try (FileReader reader = new FileReader(url); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String Line = new String();
            while ((Line = bufferedReader.readLine()) != null){
                //System.out.println(Line);
                String[] split = Line.split(",");
                if(split.length != 3){
                    continue;
                }
                HeatPosition heat = new HeatPosition(Double.valueOf(split[0]), Double.valueOf(split[1]), Integer.valueOf(split[2]));
                positions.add(heat);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;
        return positions;
    }
}

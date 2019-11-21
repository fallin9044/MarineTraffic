package com.marine.controller;

import com.marine.mapentity.HeatPosition;
import com.marine.mapservice.Impl.MapServiceImpl;
import com.marine.mapservice.MapService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/20 21:16
 * @Description:
 */
@Controller
public class MapController {

    MapService HeatMap = new MapServiceImpl();

    @RequestMapping("/Map")
    public String Map(){
        return "Map";
    }

    @RequestMapping("/Map2")
    public String Map2(){
        return "Map2";
    }

    @ResponseBody
    @RequestMapping("/heatmap")
    public List<HeatPosition> HeatMap(){

        List<HeatPosition> heatPositions = new ArrayList<>();
        //测试用url
        heatPositions = HeatMap.HeatMap("123");
        return heatPositions;
    }
}

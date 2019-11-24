package com.marine.controller;

import com.marine.mapentity.DoorLine;
import com.marine.mapentity.HeatPosition;
import com.marine.mapentity.Trajectory;
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

    MapService Map = new MapServiceImpl();

    @RequestMapping("/Map1")
    public String Map1(){ return "HeatMap";}

    @RequestMapping("Map2")
    public String Map2(){ return "DoorLine";}

    @RequestMapping("Map3")
    public String Map3(){ return "Trajectory";}

    @RequestMapping("Map4")
    public String Map4(){ return "PointList";}

    @ResponseBody
    @RequestMapping("/heatmap")
    public List<HeatPosition> HeatMap(){

        List<HeatPosition> heatPositions = new ArrayList<>();
        //测试用url
        heatPositions = Map.HeatMap("123");
        return heatPositions;
    }

    @ResponseBody
    @RequestMapping("/doorline")
    public List<List<DoorLine>> DoorLine(){
        List<List<DoorLine>> doorLines = new ArrayList<>();
        //测试用yrl
        doorLines = Map.DoorLine("123");
        return doorLines;
    }

    @ResponseBody
    @RequestMapping("/trajectory")
    public List<List<Trajectory>> Trajectory(){

        List<List<Trajectory>> trajectories = new ArrayList<>();
        //测试用url
        trajectories = Map.Trajectory("123");
        return trajectories;
    }

}

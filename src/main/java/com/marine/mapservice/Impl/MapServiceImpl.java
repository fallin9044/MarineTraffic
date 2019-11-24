package com.marine.mapservice.Impl;

import com.marine.entity.web.FileForSelect;
import com.marine.mapentity.DoorLine;
import com.marine.mapentity.HeatPosition;
import com.marine.mapentity.Trajectory;
import com.marine.mapservice.MapService;

import java.io.*;
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
            while ((Line = bufferedReader.readLine()) != null) {
                //System.out.println(Line);
                String[] split = Line.split(",");
                if (split.length != 3) {
                    continue;
                }
                HeatPosition heat = new HeatPosition(Double.valueOf(split[0]) + 0.0112, Double.valueOf(split[1]) + 0.0035, Integer.valueOf(split[2].split("\r\n")[0]));
                positions.add(heat);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
        return positions;
    }

    @Override
    public List<List<DoorLine>> DoorLine(String url) {

        List<List<DoorLine>> doorLinesList = new ArrayList<>();

        //测试用
        url = "src/main/resources/data/doorline2.txt";
        try (FileReader reader = new FileReader(url); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String Line = new String();
            while ((Line = bufferedReader.readLine())!= null){
                if(Line == ""){
                    continue;
                }
                String[] split = Line.split("-");
                split[split.length - 1] = split[split.length - 1].split("\r\n")[0];
                List<DoorLine> doorLines = new ArrayList<>();
                for (int i = 0; i < split.length; i++) {
                    String[] point = split[i].split(",");
                    DoorLine doorLine = new DoorLine(Double.valueOf(point[0]) + 0.0112, Double.valueOf(point[1]) + 0.0035);
                    doorLines.add(doorLine);
                }
                doorLinesList.add(doorLines);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doorLinesList;
    }

    @Override
    public List<List<Trajectory>> Trajectory(String url) {

        List<List<Trajectory>> trajectoriesList = new ArrayList<>();

        //测试用
        url = "src/main/resources/data/trajectory1.txt";
        try(FileReader reader = new FileReader(url); BufferedReader bufferedReader = new BufferedReader(reader)){
            String Line = new String();
            while((Line = bufferedReader.readLine()) != null){
                String[] split = Line.split("-");
                if(split.length < 3){
                    continue;
                }
                List<Trajectory> trajectories = new ArrayList<>();
                split[split.length - 1] = split[split.length - 1].split("\r\n")[0];
                for (int i = 0; i < split.length; i++) {
                    String[] point = split[i].split(",");
                    if(point.length < 2){
                        continue;
                    }
                    Trajectory trajectory = new Trajectory(Double.valueOf(point[0]) + 0.0112, Double.valueOf(point[1]) + 0.0035);
                    trajectories.add(trajectory);
                }
                trajectoriesList.add(trajectories);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trajectoriesList;
    }

    public FileForSelect getFileList(String root){
        if("".equals(root)||root == null) root = "src/main/resources/data";
        File file = new File(root);
        if(file.exists()){
            if(file.isDirectory())
                return scanFile(new FileForSelect(root,file.getName(),file.isDirectory()));
            else return new FileForSelect(root,file.getName(),file.isDirectory());
        }
        else return null;
    }

    public FileForSelect scanFile(FileForSelect root){
        File file = new File(root.getPath());
        for(File child:file.listFiles()){
            FileForSelect childMode = new FileForSelect(root.getPath()+"/"+child.getName(),child.getName(),child.isDirectory());
            if(child.isDirectory()) childMode = scanFile(childMode);
            root.addChild(childMode);
        }
        return root;
    }
}

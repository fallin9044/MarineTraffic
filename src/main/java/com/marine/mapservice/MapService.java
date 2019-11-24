package com.marine.mapservice;

import com.marine.entity.web.FileForSelect;
import com.marine.mapentity.DoorLine;
import com.marine.mapentity.HeatPosition;
import com.marine.mapentity.Trajectory;

import java.util.List;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/20 15:52
 * @Description:
 */
public interface MapService {

    /**
     * @return java.util.List<com.marine.mapentity.HeatPosition>
     * @Author cuishuyang
     * @Description
     * @Date 8:44 下午 2019/11/20
     * @Param [url]
     **/
    public List<HeatPosition> HeatMap(String url);

    /**
     * @return java.util.List<com.marine.mapentity.DoorLine>
     * @Author cuishuyang
     * @Description
     * @Date 1:35 下午 2019/11/23
     * @Param [url]
     **/
    public List<List<DoorLine>> DoorLine(String url);

    /**
     * @return java.util.List<com.marine.mapentity.Trajectory>
     * @Author cuishuyang
     * @Description
     * @Date 1:38 下午 2019/11/23
     * @Param []
     **/
    public List<List<Trajectory>> Trajectory(String url);

    /**
     *
     * @param root
     * @return
     */
    public FileForSelect getFileList(String root);

}

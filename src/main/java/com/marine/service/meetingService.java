package com.marine.service;

import com.marine.entity.CulMeetingRequest;
import com.marine.entity.CulMeetingResponse;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 09:33
 * @Description:
 */
public interface meetingService {

    /**
         * @Author cuishuyang
         * @Description 计算会遇
         * @Date 9:35 上午 2019/11/15
         * @Param [request]
         * @return CulMeetingResponse
    **/
    public CulMeetingResponse CulMeeting(CulMeetingRequest request);


}

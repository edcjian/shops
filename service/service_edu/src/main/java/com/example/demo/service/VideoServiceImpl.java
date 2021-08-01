package com.example.demo.service;

import com.example.demo.feign.VodMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.Video;
import com.example.demo.mapper.VideoMapper;
import com.example.demo.service.impl.VideoService;

@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {
    @Autowired
    private VodMediaService vodMediaService;
    @Override
    public void removeMediaVideoByCourseId(String id) {

    }

    @Override
    public void removeMediaVideoById(String id) {
        log.warn("VideoServiceImpl：video id = " + id);
        //根据videoid找到视频id
        Video video = baseMapper.selectById(id);
        String videoSourceId = video.getVideoSourceId();
        log.warn("VideoServiceImpl：videoSourceId= " + videoSourceId);
        vodMediaService.removeVideo(videoSourceId);
    }
}


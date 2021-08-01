package com.example.demo.service.impl;

import com.example.demo.domain.Video;
import com.baomidou.mybatisplus.extension.service.IService;

public interface VideoService extends IService<Video> {


    void removeMediaVideoByCourseId(String id);

    void removeMediaVideoById(String id);
}


package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.CourseCollect;
import com.example.demo.mapper.CourseCollectMapper;
import com.example.demo.service.impl.CourseCollectService;

@Service
public class CourseCollectServiceImpl extends ServiceImpl<CourseCollectMapper, CourseCollect> implements CourseCollectService {

}


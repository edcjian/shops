package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.CourseDescriptionMapper;
import com.example.demo.domain.CourseDescription;
import com.example.demo.service.impl.CourseDescriptionService;

@Service
public class CourseDescriptionServiceImpl extends ServiceImpl<CourseDescriptionMapper, CourseDescription> implements CourseDescriptionService {

}


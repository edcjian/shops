package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.ChapterMapper;
import com.example.demo.domain.Chapter;
import com.example.demo.service.impl.ChapterService;

@Service
public class ChapterServiceImpl extends ServiceImpl<ChapterMapper, Chapter> implements ChapterService {

}


package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.domain.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.vo.TeacherQueryVo;

import java.util.List;
import java.util.Map;

public interface TeacherService extends IService<Teacher> {


    List<Map<String, Object>> selectNameList(String key);

    IPage<Teacher> selectPage(Page<Teacher> pageParam, TeacherQueryVo teacherQueryVo);
}


package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.domain.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.form.CourseInfoForm;
import com.example.demo.vo.CoursePublishVo;
import com.example.demo.vo.CourseQueryVo;
import com.example.demo.vo.CourseVo;

public interface CourseService extends IService<Course> {


    String saveCourseInfo(CourseInfoForm courseInfoForm);

    CoursePublishVo getCoursePublishVoById(String id);

    boolean publishCourseById(String id);

    CourseInfoForm getCourseInfoById(String id);

    IPage<CourseVo> selectPage(Long page, Long limit, CourseQueryVo courseQueryVo);

    void removeCoverById(String id);

    boolean removeCourseById(String id);

    void updateCourseInfoByIf(CourseInfoForm courseInfoForm);
}


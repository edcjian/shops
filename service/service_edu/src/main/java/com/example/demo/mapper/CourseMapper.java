package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.domain.Course;
import com.example.demo.vo.CoursePublishVo;
import com.example.demo.vo.CourseVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CourseMapper extends BaseMapper<Course> {
    CoursePublishVo selectCoursePublishVoById(String id);

    List<CourseVo> selectPageByCourseQueryVo(Page<CourseVo> pageParam, @Param(Constants.WRAPPER) QueryWrapper<CourseVo> queryWrapper);
}

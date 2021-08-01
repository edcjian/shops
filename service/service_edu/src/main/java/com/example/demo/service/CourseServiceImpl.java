package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.domain.CourseDescription;
import com.example.demo.form.CourseInfoForm;
import com.example.demo.mapper.*;
import com.example.demo.vo.CoursePublishVo;
import com.example.demo.vo.CourseQueryVo;
import com.example.demo.vo.CourseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.Course;
import com.example.demo.service.impl.CourseService;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

    @Resource
    private CourseDescriptionMapper courseDescriptionMapper;

    @Resource
    private VideoMapper videoMapper;
    @Resource
    private ChapterMapper chapterMapper;
    @Resource
    private CommentMapper commentMapper;
    @Resource
    private CourseCollectMapper courseCollectMapper;

/*    @Resource
    private OssFileService ossFileService;*/

    @Resource
    private TeacherMapper teacherMapper;  @Override
    public String saveCourseInfo(CourseInfoForm courseInfoForm) {
        Course course = new Course();
        BeanUtils.copyProperties(courseInfoForm, course);
        course.setStatus(Course.COURSE_DRAFT);
        baseMapper.insert(course);
        CourseDescription courseDescription = new CourseDescription();
        courseDescription.setDescription(courseInfoForm.getDescription());
        courseDescription.setId(course.getId());
        courseDescriptionMapper.insert(courseDescription);
        return course.getId();
    }

    @Override
    public boolean removeCourseById(String id) {
        return false;
    }

    @Override
    public void updateCourseInfoByIf(CourseInfoForm courseInfoForm) {
        //更新Course
        Course course = new Course();
        BeanUtils.copyProperties(courseInfoForm, course);
        baseMapper.updateById(course);

        //更新CourseDescription
        CourseDescription courseDescription = new CourseDescription();
        courseDescription.setDescription(courseInfoForm.getDescription());
        courseDescription.setId(courseInfoForm.getId());
        courseDescriptionMapper.updateById(courseDescription);
    }

    @Override
    public CoursePublishVo getCoursePublishVoById(String id) {
        return baseMapper.selectCoursePublishVoById(id);
    }

    @Override
    public void removeCoverById(String id) {

    }

    @Override
    public IPage<CourseVo> selectPage(Long page, Long limit, CourseQueryVo courseQueryVo) {
        QueryWrapper<CourseVo> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("c.gmt_create");

        String title = courseQueryVo.getTitle();
        String teacherId = courseQueryVo.getTeacherId();
        String subjectParentId = courseQueryVo.getSubjectParentId();
        String subjectId = courseQueryVo.getSubjectId();
        if(!StringUtils.isEmpty(title)){
            queryWrapper.like("c.title", title);
        }

        if(!StringUtils.isEmpty(teacherId)){
            queryWrapper.eq("c.teacher_id", teacherId);
        }

        if(!StringUtils.isEmpty(subjectParentId)){
            queryWrapper.eq("c.subject_parent_id", subjectParentId);
        }

        if(!StringUtils.isEmpty(subjectId)){
            queryWrapper.eq("c.subject_id", subjectId);
        }

        //组装分页
        Page<CourseVo> pageParam = new Page<>(page, limit);
        List<CourseVo> records = baseMapper.selectPageByCourseQueryVo(pageParam, queryWrapper);
        return pageParam.setRecords(records);
    }

    @Override
    public boolean publishCourseById(String id) {
        Course course = new Course();
        course.setId(id);
        course.setStatus(Course.COURSE_NORMAL);
        return this.updateById(course);
    }

    @Override
    public CourseInfoForm getCourseInfoById(String id) {
        Course course = baseMapper.selectById(id);
        if(course == null){
            return null;
        }

        //根据id获取CourseDescription
        CourseDescription courseDescription = courseDescriptionMapper.selectById(id);

        //组装成CourseInfoForm
        CourseInfoForm courseInfoForm = new CourseInfoForm();
        BeanUtils.copyProperties(course, courseInfoForm);
        courseInfoForm.setDescription(courseDescription.getDescription());

        return courseInfoForm;
    }
}


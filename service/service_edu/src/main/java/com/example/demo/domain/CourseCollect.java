package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 课程收藏
 */
@ApiModel(value = "com-example-service_edu-domain-CourseCollect")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "edu_course_collect")
public class CourseCollect extends BaseEntity {
    /**
     * 课程讲师ID
     */
    @TableField(value = "course_id")
    @ApiModelProperty(value = "课程讲师ID")
    private String courseId;

    /**
     * 课程专业ID
     */
    @TableField(value = "member_id")
    @ApiModelProperty(value = "课程专业ID")
    private String memberId;
}

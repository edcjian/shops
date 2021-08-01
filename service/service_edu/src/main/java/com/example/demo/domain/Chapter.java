package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 课程
 */
@ApiModel(value = "com-example-service_edu-domain-Chapter")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "edu_chapter")
public class Chapter extends BaseEntity {
    /**
     * 课程ID
     */
    @TableField(value = "course_id")
    @ApiModelProperty(value = "课程ID")
    private String courseId;

    /**
     * 章节名称
     */
    @TableField(value = "title")
    @ApiModelProperty(value = "章节名称")
    private String title;

    /**
     * 显示排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value = "显示排序")
    private Integer sort;
}

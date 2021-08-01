package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 课程简介
 */
@ApiModel(value = "com-example-service_edu-domain-CourseDescription")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "edu_course_description")
public class CourseDescription extends BaseEntity {
    private static final long serialVersionUID=1L;

    /**
     * 课程简介
     */

    @TableField(value = "description")
    @ApiModelProperty(value = "课程简介")
    private String description;

/*    @ApiModelProperty(value = "讲师ID")
    @TableId(value = "id", type = IdType.NONE)
    private String id;*/
    //todo
}

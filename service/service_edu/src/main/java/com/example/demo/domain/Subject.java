package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 课程科目
 */
@ApiModel(value = "com-example-service_edu-domain-Subject")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "edu_subject")
public class Subject extends BaseEntity {
    /**
     * 类别名称
     */
    @TableField(value = "title")
    @ApiModelProperty(value = "类别名称")
    private String title;

    /**
     * 父ID
     */
    @TableField(value = "parent_id")
    @ApiModelProperty(value = "父ID")
    private String parentId;

    /**
     * 排序字段
     */
    @TableField(value = "sort")
    @ApiModelProperty(value = "排序字段")
    private Integer sort;
}

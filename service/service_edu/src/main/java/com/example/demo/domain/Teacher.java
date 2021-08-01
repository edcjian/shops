package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 讲师
 */
@ApiModel(value = "com-example-service_edu-domain-Teacher")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "edu_teacher")
public class Teacher extends BaseEntity {
    /**
     * 讲师姓名
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "讲师姓名")
    private String name;

    /**
     * 讲师简介
     */
    @TableField(value = "intro")
    @ApiModelProperty(value = "讲师简介")
    private String intro;

    /**
     * 讲师资历,一句话说明讲师
     */
    @TableField(value = "career")
    @ApiModelProperty(value = "讲师资历,一句话说明讲师")
    private String career;

    /**
     * 头衔 1高级讲师 2首席讲师
     */
    @TableField(value = "`level`")
    @ApiModelProperty(value = "头衔 1高级讲师 2首席讲师")
    private Integer level;

    /**
     * 讲师头像
     */
    @TableField(value = "avatar")
    @ApiModelProperty(value = "讲师头像")
    private String avatar;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value = "排序")
    private Integer sort;

    /**
     * 入驻时间
     */
    @TableField(value = "join_date")
    @ApiModelProperty(value = "入驻时间")
    private Date joinDate;

    /**
     * 逻辑删除 1（true）已删除， 0（false）未删除
     */
    @TableField(value = "is_deleted")
    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Byte isDeleted;
}

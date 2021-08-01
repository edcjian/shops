package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 课程
 */
@ApiModel(value = "com-example-service_edu-domain-Course")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "edu_course")
public class Course extends BaseEntity {
    public static final String COURSE_DRAFT = "Draft";//未发布
    public static final String COURSE_NORMAL = "Normal";//已发布
    /**
     * 课程讲师ID
     */
    @TableField(value = "teacher_id")
    @ApiModelProperty(value = "课程讲师ID")
    private String teacherId;

    /**
     * 课程专业ID
     */
    @TableField(value = "subject_id")
    @ApiModelProperty(value = "课程专业ID")
    private String subjectId;

    /**
     * 课程专业父级ID
     */
    @TableField(value = "subject_parent_id")
    @ApiModelProperty(value = "课程专业父级ID")
    private String subjectParentId;

    /**
     * 课程标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value = "课程标题")
    private String title;

    /**
     * 课程销售价格，设置为0则可免费观看
     */
    @TableField(value = "price")
    @ApiModelProperty(value = "课程销售价格，设置为0则可免费观看")
    private BigDecimal price;

    /**
     * 总课时
     */
    @TableField(value = "lesson_num")
    @ApiModelProperty(value = "总课时")
    private Integer lessonNum;

    /**
     * 课程封面图片路径
     */
    @TableField(value = "cover")
    @ApiModelProperty(value = "课程封面图片路径")
    private String cover;

    /**
     * 销售数量
     */
    @TableField(value = "buy_count")
    @ApiModelProperty(value = "销售数量")
    private Long buyCount;

    /**
     * 浏览数量
     */
    @TableField(value = "view_count")
    @ApiModelProperty(value = "浏览数量")
    private Long viewCount;

    /**
     * 乐观锁
     */
    @TableField(value = "version")
    @ApiModelProperty(value = "乐观锁")
    private Long version;

    /**
     * 课程状态 Draft未发布  Normal已发布
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value = "课程状态 Draft未发布  Normal已发布")
    private String status;
}

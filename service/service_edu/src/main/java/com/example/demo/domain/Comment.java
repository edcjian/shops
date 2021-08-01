package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 评论
 */
@ApiModel(value = "com-example-service_edu-domain-Comment")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "edu_comment")
public class Comment extends BaseEntity {
    /**
     * 课程id
     */
    @TableField(value = "course_id")
    @ApiModelProperty(value = "课程id")
    private String courseId;

    /**
     * 讲师id
     */
    @TableField(value = "teacher_id")
    @ApiModelProperty(value = "讲师id")
    private String teacherId;

    /**
     * 会员id
     */
    @TableField(value = "member_id")
    @ApiModelProperty(value = "会员id")
    private String memberId;

    /**
     * 会员昵称
     */
    @TableField(value = "nickname")
    @ApiModelProperty(value = "会员昵称")
    private String nickname;

    /**
     * 会员头像
     */
    @TableField(value = "avatar")
    @ApiModelProperty(value = "会员头像")
    private String avatar;

    /**
     * 评论内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value = "评论内容")
    private String content;
}

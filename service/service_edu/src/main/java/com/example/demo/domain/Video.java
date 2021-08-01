package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 课程视频
 */
@ApiModel(value = "com-example-service_edu-domain-Video")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "edu_video")
public class Video extends BaseEntity {
    /**
     * 课程ID
     */
    @TableField(value = "course_id")
    @ApiModelProperty(value = "课程ID")
    private String courseId;

    /**
     * 章节ID
     */
    @TableField(value = "chapter_id")
    @ApiModelProperty(value = "章节ID")
    private String chapterId;

    /**
     * 节点名称
     */
    @TableField(value = "title")
    @ApiModelProperty(value = "节点名称")
    private String title;

    /**
     * 云端视频资源
     */
    @TableField(value = "video_source_id")
    @ApiModelProperty(value = "云端视频资源")
    private String videoSourceId;

    /**
     * 原始文件名称
     */
    @TableField(value = "video_original_name")
    @ApiModelProperty(value = "原始文件名称")
    private String videoOriginalName;

    /**
     * 排序字段
     */
    @TableField(value = "sort")
    @ApiModelProperty(value = "排序字段")
    private Integer sort;

    /**
     * 播放次数
     */
    @TableField(value = "play_count")
    @ApiModelProperty(value = "播放次数")
    private Long playCount;

    /**
     * 是否可以试听：0收费 1免费
     */
    @TableField(value = "is_free")
    @ApiModelProperty(value = "是否可以试听：0收费 1免费")
    private Byte isFree;

    /**
     * 视频时长（秒）
     */
    @TableField(value = "duration")
    @ApiModelProperty(value = "视频时长（秒）")
    private Double duration;

    /**
     * 状态
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value = "状态")
    private String status;

    /**
     * 视频源文件大小（字节）
     */
    @TableField(value = "`size`")
    @ApiModelProperty(value = "视频源文件大小（字节）")
    private Long size;

    /**
     * 乐观锁
     */
    @TableField(value = "version")
    @ApiModelProperty(value = "乐观锁")
    private Long version;
}

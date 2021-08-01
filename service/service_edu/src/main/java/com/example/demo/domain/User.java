package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel(value = "com-example-service_edu-domain-User")
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "`user`")
public class User extends BaseEntity {
    /**
     * 姓名
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 年龄
     */
    @TableField(value = "age")
    @ApiModelProperty(value = "年龄")
    private Integer age;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value = "邮箱")
    private String email;
}

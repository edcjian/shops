package com.example.demo.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @projectName: shops
 * @package: com.example.service_edu.domain
 * @className: DemoData
 * @author: Eric
 * @description: TODO
 * @date: 2021/7/27 15:53
 * @version: 1.0
 */
@Data
public class DemoData {
    //设置excel表头名称
    @ExcelProperty(value = "学生编号",index = 0)
    private Integer sno;
    @ExcelProperty(value = "学生姓名",index = 1)
    private String sname;
}

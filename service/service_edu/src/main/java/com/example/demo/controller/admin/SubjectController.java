package com.example.demo.controller.admin;

import com.example.demo.common.base.result.R;
import com.example.demo.common.base.result.ResultCodeEnum;
import com.example.demo.common.base.util.ExceptionUtils;
import com.example.demo.exception.GuliException;
import com.example.demo.service.impl.SubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @projectName: shops
 * @package: com.example.service_edu.controller.admin
 * @className: SubjectController
 * @author: Eric
 * @description: TODO
 * @date: 2021/7/27 15:42
 * @version: 1.0
 */
@Api(description = "课程分类管理")
@RestController
@RequestMapping("/admin/edu/subject")
@Slf4j
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
@GetMapping("/hello")
public int hello(){
    return 123;
}

    @ApiOperation("Excel批量导入课程分类")
    @PostMapping("import")
    public R batchImport(
            @ApiParam(value = "Excel文件", required = true)
            @RequestParam("file") MultipartFile file){
        try {
            InputStream inputStream = file.getInputStream();
            subjectService.batchImport(inputStream);
            return R.ok().message("批量导入成功");
        } catch (IOException e) {
            log.error(ExceptionUtils.getMessage(e));
            throw new GuliException(ResultCodeEnum.EXCEL_DATA_IMPORT_ERROR);
        }


    }
}

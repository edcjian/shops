package com.example.demo.controller.admin;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.base.result.R;
import com.example.demo.domain.Teacher;
import com.example.demo.service.impl.TeacherService;
import com.example.demo.vo.TeacherQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @projectName: shop
 * @package: com.example.demo.controller.admin
 * @className: TeacherController
 * @author: Eric
 * @description: TODO
 * @date: 2021/7/23 15:30
 * @version: 1.0
 */
@Api(description = "讲师管理")
@RestController
@RequestMapping("/admin/edu/teacher")
@Slf4j
public class TeacherController {
    @Resource
    private TeacherService teacherService;


    @ApiOperation("新增讲师")
    @PostMapping("save")
    public R save(@ApiParam(value = "讲师对象", required = true) @RequestBody Teacher teacher){
        teacherService.save(teacher);
        return R.ok().message("保存成功");
    }
    @ApiOperation("更新讲师")
    @PutMapping("update")
    public R updateById(@ApiParam(value = "讲师对象", required = true) @RequestBody Teacher teacher){
        boolean result = teacherService.updateById(teacher);
        if(result){
            return R.ok().message("修改成功");
        }else{
            return R.error().message("数据不存在");
        }
    }
    @ApiOperation("讲师分页列表")
    @GetMapping("list/{page}/{limit}")
    public R listPage(@ApiParam(value = "当前页码", required = true) @PathVariable Long page,
                      @ApiParam(value = "每页记录数", required = true) @PathVariable Long limit,
                      @ApiParam("讲师列表查询对象") TeacherQueryVo teacherQueryVo){

        Page<Teacher> pageParam = new Page<>(page, limit);
        IPage<Teacher> pageModel = teacherService.selectPage(pageParam, teacherQueryVo);
        List<Teacher> records = pageModel.getRecords();
        long total = pageModel.getTotal();
        return R.ok().data("total", total).data("rows", records);
    }
    @ApiOperation("根据关键字查询讲师名列表")
    @GetMapping("list/name/{key}")
    public R selectNameListByKey(
            @ApiParam(value = "关键字", required = true)
            @PathVariable String key){
        List<Map<String, Object>> nameList = teacherService.selectNameList(key);

        return R.ok().data("nameList", nameList);
    }
    @ApiOperation("所有讲师列表")
    @GetMapping("list")
    public R listAll(){
        List<Teacher> list = teacherService.list();
        return R.ok().data("items", list);
    }
    @ApiOperation("根据id获取讲师信息")
    @GetMapping("get/{id}")
    public R getById(@ApiParam(value = "讲师ID", required = true) @PathVariable String id){
        Teacher teacher = teacherService.getById(id);
        if(teacher != null){
            return R.ok().data("item", teacher);
        }else{
            return R.error().message("数据不存在");
        }
    }
    @ApiOperation(value = "根据ID列表删除讲师")
    @DeleteMapping("batch-remove")
    public R removeRows(
            @ApiParam(value = "讲师ID列表", required = true)
            @RequestBody List<String> idList){
        boolean result = teacherService.removeByIds(idList);
        if(result){
            return R.ok().message("删除成功");
        }else{
            return R.error().message("数据不存在");
        }
    }
}

package com.example.demo.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.demo.excel.ExcelSubjectData;
import com.example.demo.listener.ExcelSubjectDataListener;
import org.springframework.stereotype.Service;

import java.io.InputStream;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.SubjectMapper;
import com.example.demo.domain.Subject;
import com.example.demo.service.impl.SubjectService;

@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {
    @Override
    public void batchImport(InputStream inputStream) {
        EasyExcel.read(inputStream, ExcelSubjectData.class, new ExcelSubjectDataListener(baseMapper))
                .excelType(ExcelTypeEnum.XLS)
                .sheet().doRead();
    }

}


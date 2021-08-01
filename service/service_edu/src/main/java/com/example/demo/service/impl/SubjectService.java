package com.example.demo.service.impl;

import com.example.demo.domain.Subject;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.InputStream;

public interface SubjectService extends IService<Subject> {


    void batchImport(InputStream inputStream);
}


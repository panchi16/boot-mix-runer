package com.panda.boot.service;

import com.panda.boot.dao.T1Mapper;
import com.panda.boot.model.dto.T1DO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class T1ServiceImpl implements T1Service {

    @Resource
    T1Mapper t1Mapper;

    @Override
    public T1DO getById(Integer id) {

        return t1Mapper.getById(id);
    }
}

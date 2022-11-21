package com.panda.boot.controller;

import com.panda.boot.model.dto.T1DO;
import com.panda.boot.service.T1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/t1")
public class T1Controller {

    @Resource
    T1Service t1Service;

    @GetMapping("/get")
    public T1DO get(Integer id) {
        return t1Service.getById(id);
    }

}

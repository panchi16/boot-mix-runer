package com.panda.boot.controller;


import com.panda.boot.cglibGdk.CglibService;
import com.panda.boot.cglibGdk.CompanyService;
import com.panda.boot.cglibGdk.GdkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/cglib")
public class CglibTestController {

    @Autowired
    CglibService cglibService;

    @Autowired
    GdkService gdkService;

    @GetMapping("/testCglib")
    public Integer testCglib(Integer a, Integer b){
       return cglibService.testCglib(a, b);
    }

    @GetMapping("/testGdkProxy")
    public Integer testGdkProxy(Integer a, Integer b){
        return gdkService.testGdkProxy(a, b);
    }

    @GetMapping("/testGdkProxy2")
    public Integer testGdkProxy2(Integer a, Integer b){
        return gdkService.testGdkProxy2(a, b);
    }
}

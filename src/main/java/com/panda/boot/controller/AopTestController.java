package com.panda.boot.controller;

import com.panda.boot.aop.CalImpl;
import com.panda.boot.aop.Cal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopTestController {

    @Autowired
    Cal cal;

    @GetMapping("/add")
    public void add(){
         cal.add(1,2);
    }

    @GetMapping("/sub")
    public void sub(){
        cal.sub(1,2);
    }

}

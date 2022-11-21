package com.panda.boot.cglibGdk;

import org.springframework.stereotype.Service;

public class CompanyServiceImpl implements CompanyService {
    @Override
    public Integer math(Integer a, Integer b) {
        return a + b;
    }
}

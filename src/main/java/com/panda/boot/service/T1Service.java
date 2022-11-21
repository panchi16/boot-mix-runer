package com.panda.boot.service;

import com.panda.boot.model.dto.T1DO;
import org.springframework.stereotype.Service;

public interface T1Service {
    T1DO getById(Integer id);
}

package com.jihoon.firstproject.service.implement;

import org.springframework.stereotype.Service;

import com.jihoon.firstproject.service.MainService;

@Service
public class MainServiceImplement implements MainService {

    @Override
    public String hello() {
        return "Hello! 서지훈!";
    }
    
}

package com.jihoon.firstproject.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jihoon.firstproject.provider.JwtTokenProvider;
import com.jihoon.firstproject.service.MainService;

@Service
public class MainServiceImplement implements MainService {

    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    public MainServiceImplement(
        JwtTokenProvider jwtTokenProvider
    ) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    public String hello() {
        return "Hello! 서지훈!";
    }

    @Override
    public String getJwt(String data) {
        String jwt = jwtTokenProvider.create(data);
        return jwt;
    }

    @Override
    public String validJwt(String jwt) {
        String subject = jwtTokenProvider.validate(jwt);
        return subject;
    }
    
}

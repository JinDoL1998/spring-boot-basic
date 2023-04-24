package com.jihoon.firstproject.service.implement;

import org.springframework.stereotype.Service;

import com.jihoon.firstproject.service.RestApiService;

@Service
public class RestApiServiceImplement implements RestApiService {
    
    public String getMethod() {
        return "Return to Service Layer";
    }
}

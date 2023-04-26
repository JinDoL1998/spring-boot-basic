package com.jinseong.board.service;

import org.springframework.http.ResponseEntity;

import com.jinseong.board.dto.request.PostUserRequestDto;
import com.jinseong.board.dto.response.ResponseDto;

public interface UserService {
    
    public ResponseEntity<ResponseDto> postUser(PostUserRequestDto dto);

}

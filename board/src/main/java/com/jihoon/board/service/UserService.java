package com.jihoon.board.service;

import org.springframework.http.ResponseEntity;

import com.jihoon.board.dto.request.user.PostUserRequestDto;
import com.jihoon.board.dto.response.ResponseDto;

public interface UserService {
    
    public ResponseEntity<ResponseDto> postUser(PostUserRequestDto dto);

}

package com.jinseong.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jinseong.board.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    
    public boolean existsByEmail(String email);
    public boolean existsByNickname(String nickname);
    public boolean existsByPhoneNumber(String phoneNumber);

}

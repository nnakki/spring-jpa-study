package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test(){
        User user = User.builder()
                .name("nnakki")
                .email("yvely001@naver.com")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        System.out.println(">>>" + user.toString());
    }

}
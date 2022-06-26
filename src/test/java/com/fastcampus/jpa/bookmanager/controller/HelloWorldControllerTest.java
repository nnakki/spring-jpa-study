package com.fastcampus.jpa.bookmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class HelloWorldControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test   // 테스트 메소드 생성
    void helloWorld() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/hello-world"))    // get 요청을 테스트
        .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("hello-world"));
    }
}
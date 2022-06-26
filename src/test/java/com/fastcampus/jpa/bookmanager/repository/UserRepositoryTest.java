package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){
        // create, read, update, delete

        userRepository.save(new User());
        System.out.println(">>>> " + userRepository.findAll());  // User의 모든 데이터를 리스트 형식으로 가져온다

    }
}
package com.gmartinez.bookshopping;

import static org.assertj.core.api.Assertions.assertThat;

import com.gmartinez.bookshopping.controller.BookController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmokeTest {

    @Autowired
    private BookController bookController;

    @Test
    void contextLoads() {
        assertThat(bookController).isNotNull();
    }
}
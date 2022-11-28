package com.zy;

import com.zy.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootTestApplicationTests {

    @Autowired
    private BookService bookService;
    @Test
    public void testSave() {
        bookService.save();
    }
}

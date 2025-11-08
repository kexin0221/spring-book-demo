package com.bite.springbookdemo.controller;

import com.bite.springbookdemo.dao.BookInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/book")
@RestController
public class BookController {
    @RequestMapping("/getList")
    public List<BookInfo> getList() {
        List<BookInfo> books = mockData();
        for (BookInfo book : books) {
            if (book.getStatus() == 1) {
                book.setStatusCN("可借阅");
            } else {
                book.setStatusCN("不可借阅");
            }
        }
        return books;
    }

    private List<BookInfo> mockData() {
        return List.of();
    }
}

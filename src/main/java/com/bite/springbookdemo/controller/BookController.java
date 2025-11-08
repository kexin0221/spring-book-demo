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
        // 模拟数据生成逻辑
        // 此处省略具体实现，可参考 P87 的 mockData 方法
        return List.of(); // 实际应返回模拟的图书列表
    }
}

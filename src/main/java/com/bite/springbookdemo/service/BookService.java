package com.bite.springbookdemo.service;

import com.bite.springbookdemo.dao.BookInfo;
import com.bite.springbookdemo.mapper.BookInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

//    public List<BookInfo> getList() {
//    }

    public void addBook(BookInfo bookInfo) {
        bookInfoMapper.addBook(bookInfo);
    }
}

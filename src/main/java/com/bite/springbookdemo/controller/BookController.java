package com.bite.springbookdemo.controller;

import com.bite.springbookdemo.model.BookInfo;
import com.bite.springbookdemo.model.PageRequest;
import com.bite.springbookdemo.model.ResponseResult;
import com.bite.springbookdemo.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

//    @RequestMapping("/getList")
//    public List<BookInfo> getList() {
//        return bookService.getList();
//    }

    @RequestMapping("/addBook")
    public String addBook(BookInfo bookInfo) {
        log.info("添加图书, request: {}", bookInfo);
        //1. 参数校验
        if (!StringUtils.hasLength(bookInfo.getBookName())) {
            log.error("添加图书，参数不合法，request: {}", bookInfo);
            return "书名不能为空！";
        }
        if (!StringUtils.hasLength(bookInfo.getAuthor())) {
            log.error("添加图书，参数不合法，request: {}", bookInfo);
            return "作者不能为空！";
        }
        if (bookInfo.getCount() == null) {
            log.error("添加图书，参数不合法，request: {}", bookInfo);
            return "数量不能为空！";
        }
        if (bookInfo.getPrice() == null) {
            log.error("添加图书，参数不合法，request: {}", bookInfo);
            return "价格不能为空！";
        }
        if (!StringUtils.hasLength(bookInfo.getPublish())) {
            log.error("添加图书，参数不合法，request: {}", bookInfo);
            return "出版社不能为空！";
        }
        if (bookInfo.getStatus() == null) {
            log.error("添加图书，参数不合法，request: {}", bookInfo);
            return "状态码不能为空！";
        }
        //2. 存储数据
        //3. 返回结果
        try {
            bookService.addBook(bookInfo);
            return "";
        } catch (Exception e) {
            log.error("添加图书异常, e: {}", String.valueOf(e));
            return "添加图书发生异常！";
        }
    }

    @RequestMapping("getListByPage")
    public ResponseResult<BookInfo> getListByPage(PageRequest pageRequest) {

    }
}

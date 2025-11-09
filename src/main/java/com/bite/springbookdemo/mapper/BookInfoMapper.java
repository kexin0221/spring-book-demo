package com.bite.springbookdemo.mapper;

import com.bite.springbookdemo.dao.BookInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookInfoMapper {

    @Insert("insert into book_info (book_name, author, count, price, publish) " +
            "values (#{bookName}, #{author}, #{count}, #{price}, #{publish})")
    Integer addBook(BookInfo bookInfo);
}

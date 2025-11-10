package com.bite.springbookdemo.mapper;

import com.bite.springbookdemo.model.BookInfo;
import com.bite.springbookdemo.model.PageRequest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookInfoMapper {

    @Insert("insert into book_info (book_name, author, count, price, publish, status) " +
            "values (#{bookName}, #{author}, #{count}, #{price}, #{publish}, #{status})")
    void addBook(BookInfo bookInfo);

    @Select("select * from book_info where status!=0 limit #{offset}, #{pageSize}")
    List<BookInfo> selectBooksByPage(PageRequest pageRequest);

    @Select("select count(1) from book_info where status != 0")
    Integer count();
}

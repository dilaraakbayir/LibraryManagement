package com.dilara.repository;

import com.dilara.entity.Book;

public class BookRepository extends Repository<Book, Long>{
    public BookRepository(){
        super(new Book());
    }
}

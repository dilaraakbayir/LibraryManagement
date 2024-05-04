package com.dilara.repository;

import com.dilara.entity.Author;

public class AuthorRepository extends Repository<Author, Long>{
    public AuthorRepository(){
        super(new Author());
    }
}

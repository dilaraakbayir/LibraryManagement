package com.dilara.repository;

import com.dilara.entity.Borrow;

public class BorrowRepository extends Repository<Borrow, Long>{
    public BorrowRepository(){
        super(new Borrow());
    }
}

package com.dilara.repository;

import com.dilara.entity.Address;

public class AddressRepository extends Repository<Address,Long> {
    public AddressRepository(){
        super(new Address());
    }
}

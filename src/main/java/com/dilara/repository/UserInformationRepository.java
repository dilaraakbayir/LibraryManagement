package com.dilara.repository;

import com.dilara.entity.UserInformation;

public class UserInformationRepository extends Repository<UserInformation,Long> {
    public UserInformationRepository(){
        super(new UserInformation());
    }
}

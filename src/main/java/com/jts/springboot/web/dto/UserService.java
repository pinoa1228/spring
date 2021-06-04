package com.jts.springboot.web.dto;

import com.jts.springboot.domain.repository.UserRepository;

public class UserService {
    public static boolean checkIdDuplicate(String id){
        return UserRepository.existsById(id);
    }
}

package com.jts.springboot.domain.repository;

import com.jts.springboot.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    //@Query(value = "select * from USER  u where u.id = :id and u.pw = :pw", nativeQuery = true)
    //UserEntity findUserEntity(String id,String pw);
    UserEntity findByIdAndPw(String id, String pw);

}
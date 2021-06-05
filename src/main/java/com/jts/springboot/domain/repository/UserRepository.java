package com.jts.springboot.domain.repository;

import com.jts.springboot.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    @Query(value = "select * from user  u where u.id = :id and u.pw = :pw", nativeQuery = true)
    UserEntity findUserEntity(String id,String pw);
    //UserEntity findByIdAndPw(String id, String pw);

    UserEntity findById(String id);
  //  boolean existsById(String id);

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE user p SET p.consultant_num = ?2 WHERE p.personal_num = ?1" ,nativeQuery = true)
    UserEntity updatenum(Long personal_num,Long consultant_num);

}
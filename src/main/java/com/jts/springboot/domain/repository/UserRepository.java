package com.jts.springboot.domain.repository;

import com.jts.springboot.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    @Query(value = "select a from UserEntity a where id = :id and pw = :pw", nativeQuery = true)
    UserEntity findUserEntity(String id, String pw);
}
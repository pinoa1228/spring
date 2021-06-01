package com.jts.springboot.domain.repository;

import com.jts.springboot.domain.entity.Follow_UpEntity;
import com.jts.springboot.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollupRepository extends JpaRepository<Follow_UpEntity,Long> {

}





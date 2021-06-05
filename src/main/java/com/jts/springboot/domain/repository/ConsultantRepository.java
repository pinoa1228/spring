package com.jts.springboot.domain.repository;

import com.jts.springboot.domain.entity.ConsultantEntity;
import com.jts.springboot.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConsultantRepository extends JpaRepository<ConsultantEntity,Long> {
    @Query(value = "select * from consultant  u where u.c_consultant_num = :c_consultant_num", nativeQuery = true)
    ConsultantEntity findConsultant_num(Long c_consultant_num);
}

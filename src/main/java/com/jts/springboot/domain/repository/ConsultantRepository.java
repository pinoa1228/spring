package com.jts.springboot.domain.repository;

import com.jts.springboot.domain.entity.ConsultantEntity;
import com.jts.springboot.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultantRepository extends JpaRepository<ConsultantEntity,Long> {

    ConsultantEntity findByC_consultant_num(Long c_consultant_num);
}

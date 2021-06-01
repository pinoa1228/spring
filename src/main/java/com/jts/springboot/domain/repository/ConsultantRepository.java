package com.jts.springboot.domain.repository;

import com.jts.springboot.domain.entity.ConsultantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultantRepository extends JpaRepository<ConsultantEntity,Long> {

}

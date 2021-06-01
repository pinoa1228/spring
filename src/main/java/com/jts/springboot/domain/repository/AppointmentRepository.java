package com.jts.springboot.domain.repository;

import com.jts.springboot.domain.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity,Long> {
}

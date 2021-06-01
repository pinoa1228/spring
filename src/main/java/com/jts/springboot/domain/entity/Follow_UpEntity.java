package com.jts.springboot.domain.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity(name="Follow_Up")
public class Follow_UpEntity {

    public Follow_UpEntity(Long personal_num, String id, String appointment_content, LocalDate appointment_Date) {
        this.personal_num = personal_num;
        this.id = id;
        this.appointment_content = appointment_content;
        this.appointment_Date = appointment_Date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personal_num;

    @Column
    private String id;

    @Column
    private String appointment_content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate appointment_Date;

    @Override
    public String toString() {
        return "Follow_UpEntity{" +
                "personal_num=" + personal_num +
                ", id='" + id + '\'' +
                ", appointment_content='" + appointment_content + '\'' +
                ", appointment_Date=" + appointment_Date +
                '}';
    }
}
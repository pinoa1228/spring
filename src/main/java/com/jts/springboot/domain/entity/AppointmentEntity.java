package com.jts.springboot.domain.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
@Builder
@NoArgsConstructor

@Entity(name="APPOINTMENT")
public class AppointmentEntity {

    public AppointmentEntity(Long a_personal_num, String a_name, Long a_consultant_num, String appointment_content, LocalDate appointment_date) {
        this.a_personal_num = a_personal_num;
        this.a_name = a_name;
        this.a_consultant_num = a_consultant_num;
        this.appointment_content = appointment_content;
        this.appointment_date = appointment_date;
    }

    @Id
    private Long a_personal_num;

    @Column
    @NotEmpty
    private String a_name;

    @Column@NotEmpty
    private Long a_consultant_num;

    @Column
    private String appointment_content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate appointment_date;


    @Override
    public String toString() {
        return "AppointmentEntity{" +
                "a_personal_num=" + a_personal_num +
                ", a_name='" + a_name + '\'' +
                ", a_consultant_num=" + a_consultant_num +
                ", appointment_content='" + appointment_content + '\'' +
                ", appointment_date=" + appointment_date +
                '}';
    }
}

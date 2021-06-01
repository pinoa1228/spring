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

    public AppointmentEntity(Long personal_num, String name, Long consultant_num, String appointment_content, LocalDate appointment_date) {
        this.personal_num = personal_num;
        this.name = name;
        this.consultant_num = consultant_num;
        this.appointment_content = appointment_content;
        this.appointment_date = appointment_date;
    }

    @Id
    private Long personal_num;

    @Column
    @NotEmpty
    private String name;

    @Column@NotEmpty
    private Long consultant_num;

    @Column
    private String appointment_content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate appointment_date;


    @Override
    public String toString() {
        return "AppointmentEntity{" +
                "personal_num=" + personal_num +
                ", name='" + name + '\'' +
                ", consultant_num=" + consultant_num +
                ", appointment_content='" + appointment_content + '\'' +
                ", appointment_date=" + appointment_date +
                '}';
    }
}

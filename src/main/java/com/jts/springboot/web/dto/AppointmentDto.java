package com.jts.springboot.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jts.springboot.domain.entity.AppointmentEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

public class AppointmentDto {

    private Long a_personal_num;
    private String a_name;
    private Long a_consultant_num;
    private String appointment_content;
    private LocalDate appointment_date;

    public AppointmentDto() {
    }

    public AppointmentDto(@JsonProperty("a_personal_num") Long a_personal_num,@JsonProperty("a_name") String a_name,@JsonProperty("a_consultant_num") Long a_consultant_num,@JsonProperty("appointment_content") String appointment_content,@JsonProperty("appointment_date") LocalDate appointment_date) {
        this.a_personal_num = a_personal_num;
        this.a_name = a_name;
        this.a_consultant_num = a_consultant_num;
        this.appointment_content = appointment_content;
        this.appointment_date = appointment_date;
    }

    @Override
    public String toString() {
        return "AppointmentDto{" +
                "a_personal_num=" + a_personal_num +
                ", a_name='" + a_name + '\'' +
                ", a_consultant_num=" + a_consultant_num +
                ", appointment_content='" + appointment_content + '\'' +
                ", appointment_date=" + appointment_date +
                '}';
    }

    public AppointmentEntity toEntity(){
        AppointmentEntity appointmentEntity=new AppointmentEntity(a_personal_num,a_name,a_consultant_num,appointment_content,appointment_date);
        return  appointmentEntity;
    }
}

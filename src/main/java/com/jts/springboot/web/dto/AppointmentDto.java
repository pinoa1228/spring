package com.jts.springboot.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jts.springboot.domain.entity.AppointmentEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

public class AppointmentDto {

    private Long personal_num;
    private String name;
    private Long consultant_num;
    private String appointment_content;
    private LocalDate appointment_date;

    public AppointmentDto() {
    }

    public AppointmentDto(@JsonProperty("personal_num") Long personal_num,@JsonProperty("name") String name,@JsonProperty("consultant_num") Long consultant_num,@JsonProperty("appointment_content") String appointment_content,@JsonProperty("appointment_date") LocalDate appointment_date) {
        this.personal_num = personal_num;
        this.name = name;
        this.consultant_num = consultant_num;
        this.appointment_content = appointment_content;
        this.appointment_date = appointment_date;
    }

    @Override
    public String toString() {
        return "AppointmentDto{" +
                "personal_num=" + personal_num +
                ", name='" + name + '\'' +
                ", consultant_num=" + consultant_num +
                ", appointment_content='" + appointment_content + '\'' +
                ", appointment_date=" + appointment_date +
                '}';
    }

    public AppointmentEntity toEntity(){
        AppointmentEntity appointmentEntity=new AppointmentEntity(personal_num,name,consultant_num,appointment_content,appointment_date);
        return  appointmentEntity;
    }
}

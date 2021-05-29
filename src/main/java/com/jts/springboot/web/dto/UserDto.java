package com.jts.springboot.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jts.springboot.domain.entity.UserEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;


@Getter
@Setter
public class UserDto {
    private Long personal_num;
    private String id;
    private String pw;
    private String name;
    private String consult_content;
    private int consult_number;
    private String appointment_content;
    private LocalDate date;
    private int continuation;

    public UserDto(@JsonProperty("personal_num") Long personal_num, @JsonProperty("id") String id,
                   @JsonProperty("pw") String pw, @JsonProperty("name") String name,@JsonProperty("consult_content") String consult_content,
                   @JsonProperty("consult_number") int consult_number,@JsonProperty("appointment_content") String appointment_content,
                   @JsonProperty("date") LocalDate date,@JsonProperty("continuation") int continuation)
    { this.personal_num = personal_num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.consult_content = consult_content;
        this.consult_number = consult_number;
        this.appointment_content = appointment_content;
        this.date = date;
        this.continuation = continuation;
    }





    @Override
    public String toString() {
        return "JoinUsDto{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public UserEntity toEntity() {

        UserEntity userEntity = new UserEntity(personal_num, id, pw, name, consult_content, consult_number, appointment_content, date, continuation);
        return userEntity;
    }
}

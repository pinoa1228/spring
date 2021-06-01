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
    private Long consultant_num;


    public UserDto(@JsonProperty("personal_num") Long personal_num,
                   @JsonProperty("id") String id, @JsonProperty("pw") String pw,
                   @JsonProperty("name") String name, @JsonProperty("consultant_num") Long consultant_num){

        this.personal_num=personal_num;
        this.id=id;
        this.pw=pw;
        this.name=name;
        this.consultant_num=consultant_num;

    }


    @Override
    public String toString() {
        return "UserDto{" +
                "personal_num=" + personal_num +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", consultant_num=" + consultant_num +
                '}';
    }

    public UserEntity toEntity() {

        UserEntity userEntity = new UserEntity(personal_num, id, pw, name, consultant_num);
        return userEntity;
    }
}

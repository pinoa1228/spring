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
   private Long Personal_Num;
    private String ID;
    private String PW;
    private String Name;
    private Long Consultant_Num;

    public UserDto(Long personal_Num, String ID, String PW, String name, Long consultant_Num) {
        Personal_Num = personal_Num;
        this.ID = ID;
        this.PW = PW;
        Name = name;
        Consultant_Num = consultant_Num;
    }
    public UserDto(@JsonProperty("personal_Num") Long personal_Num,
                   @JsonProperty("ID") String id, @JsonProperty("PW") String pw,
                   @JsonProperty("Name") String name, @JsonProperty("Consultant_Num") Long consultant_Num)

    @Override
    public String toString() {
        return "UserDto{" +
                "Personal_Num=" + Personal_Num +
                ", ID='" + ID + '\'' +
                ", PW='" + PW + '\'' +
                ", Name='" + Name + '\'' +
                ", Consultant_Num=" + Consultant_Num +
                '}';
    }
    public UserEntity toEntity() {

        UserEntity userEntity = new UserEntity(Personal_Num, ID, PW, Name, Consultant_Num);
        return userEntity;
    }
}

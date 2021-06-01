package com.jts.springboot.domain.entity;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
@Builder
@NoArgsConstructor

@Entity(name="USER")//테이블명 작성(DB가 해당 객체를 인식가능)
public class UserEntity {

    public UserEntity(Long personal_Num, String ID, String PW, String name, Long consultant_Num) {
        Personal_Num = personal_Num;
        this.ID = ID;
        this.PW = PW;
        Name = name;
        Consultant_Num = consultant_Num;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Personal_Num;

    @Column
    private String ID;


    @Column @NotEmpty
    private String PW;

    @Column@NotEmpty
    private String Name;

    @Column @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Consultant_Num;

    @Override
    public String toString() {
        return "UserEntity{" +
                "Personal_Num=" + Personal_Num +
                ", ID='" + ID + '\'' +
                ", PW='" + PW + '\'' +
                ", Name='" + Name + '\'' +
                ", Consultant_Num=" + Consultant_Num +
                '}';
    }
}

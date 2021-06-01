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

    public UserEntity(Long personal_Num, String id, String pw, String name, Long consultant_Num) {
        this.personal_Num = personal_Num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.consultant_Num = consultant_Num;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personal_Num;

    @Column
    private String id;


    @Column
    @NotEmpty
    private String pw;

    @Column
    @NotEmpty
    private String name;

    @Column
    private Long consultant_Num;


    @Override
    public String toString() {
        return "UserEntity{" +
                "personal_Num=" + personal_Num +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", consultant_Num=" + consultant_Num +
                '}';
    }
}

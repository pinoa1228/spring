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

    public UserEntity(Long personal_num, String id, String pw, String name, Long consultant_num) {
        this.personal_num = personal_num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.consultant_num = consultant_num;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personal_num;

    @Id
    @Column
    private String id;


    @Column
    @NotEmpty
    private String pw;

    @Column
    @NotEmpty
    private String name;

    @Column
    private Long consultant_num;


    @Override
    public String toString() {
        return "UserEntity{" +
                "personal_num=" + personal_num +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", consultant_num=" + consultant_num +
                '}';
    }
}

package com.jts.springboot.domain.entity;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
@Builder

@Entity(name="USER")//테이블명 작성
public class UserEntity {

    public UserEntity(Long personal_num, String id, String pw, String name, String consult_content, int consult_number, String appointment_content, LocalDate date, int continuation) {
        this.personal_num = personal_num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.consult_content = consult_content;
        this.consult_number = consult_number;
        this.appointment_content = appointment_content;
        this.date = date;
        this.continuation = continuation;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personal_num;

    @Column
    private String id;

    @Column @NotEmpty
    private String pw;

    @Column@NotEmpty
    private String name;

    @Column
    private String consult_content;

    @Column(length = 10)
    private int consult_number;

    @Column
    private String appointment_content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @Column(length = 10)
    private int continuation;

    @Override
    public String toString() {
        return "UserEntity{" +
                "personal_num=" + personal_num +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", consult_content='" + consult_content + '\'' +
                ", consult_number=" + consult_number +
                ", appointment_content='" + appointment_content + '\'' +
                ", date=" + date +
                ", continuation=" + continuation +
                '}';
    }
}

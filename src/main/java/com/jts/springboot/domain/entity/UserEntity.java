package com.jts.springboot.domain.entity;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor(access=AccessLevel.PROTECTED)//생성자 룸복
@Entity(name="JTS_DB.user")//테이블명 작성
public class UserEntity {

    @Id
    private String id;

    @Column(length = 10, nullable = false)
    private String pw;

    @Column(length = 10, nullable = false)
    private String name;

    @Column
    private String consult_content;

    @Column(length = 10)
    private int consult_number;

    @Column
    private String appointment_content;

    @Column
    private String appointment_date;

    @Column(length = 10)
    private int continuation;

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", consult_content='" + consult_content + '\'' +
                ", consult_number=" + consult_number +
                ", appointment_content='" + appointment_content + '\'' +
                ", appointment_date='" + appointment_date + '\'' +
                ", continuation=" + continuation +
                '}';
    }
}

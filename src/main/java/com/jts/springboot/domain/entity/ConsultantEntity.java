package com.jts.springboot.domain.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
@Builder
@NoArgsConstructor

@Entity(name="CONSULTANT")
public class ConsultantEntity {
    public ConsultantEntity(Long c_consultant_num, String c_name, Long c_personal_num, String consultant_content, int consultant_type, LocalDate consultant_date, String negative) {
        this.c_consultant_num = c_consultant_num;
        this.c_name = c_name;
        this.c_personal_num = c_personal_num;
        this.consultant_content = consultant_content;
        this.consultant_type = consultant_type;
        this.consultant_date = consultant_date;
        this.negative = negative;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_consultant_num;


    @Column@NotEmpty
    private String c_name;

    @Column
    private Long c_personal_num;

    @Column
    private String consultant_content;
    @Column
    private int consultant_type;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate consultant_date;

    @Column
    private String negative;

    @Override
    public String toString() {
        return "ConsultantEntity{" +
                "c_consultant_num=" + c_consultant_num +
                ", c_name='" + c_name + '\'' +
                ", c_personal_num=" + c_personal_num +
                ", consultant_content='" + consultant_content + '\'' +
                ", consultant_type=" + consultant_type +
                ", consultant_date=" + consultant_date +
                ", negative='" + negative + '\'' +
                '}';
    }
}

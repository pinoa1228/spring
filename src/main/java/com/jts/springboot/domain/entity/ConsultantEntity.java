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
    public ConsultantEntity(Long consultant_num, String name, Long personal_num, String consultant_content, LocalDate consultant_date) {
        this.consultant_num = consultant_num;
        this.name = name;
        this.personal_num = personal_num;
        this.consultant_content = consultant_content;
        this.consultant_date = consultant_date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long consultant_num;


    @Column@NotEmpty
    private String name;

    @Column@NotEmpty
    private Long personal_num;

    @Column
    private String consultant_content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate consultant_date;

    @Override
    public String toString() {
        return "ConsultantEntity{" +
                "consultant_num=" + consultant_num +
                ", name='" + name + '\'' +
                ", personal_num='" + personal_num + '\'' +
                ", consultant_content='" + consultant_content + '\'' +
                ", consultant_date=" + consultant_date +
                '}';
    }
}

package com.jts.springboot.web.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.jts.springboot.domain.entity.ConsultantEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
@Setter
public class ConsultantDto {
    private Long consultant_num;
    private String name;
    private Long personal_num;
    private String consultant_content;
    private  int consultant_type;
    private LocalDate consultant_date;

    public ConsultantDto() {
    }

    public ConsultantDto(@JsonProperty("consultant_num") Long consultant_num,@JsonProperty("name") String name,@JsonProperty("personal_num") Long personal_num,@JsonProperty("consultant_content") String consultant_content,@JsonProperty("consultant_type") int consultant_type,@JsonProperty("consultant_date") LocalDate consultant_date) {
        this.consultant_num = consultant_num;
        this.name = name;
        this.personal_num = personal_num;
        this.consultant_content = consultant_content;
        this.consultant_type=consultant_type;
        this.consultant_date = consultant_date;
    }

    @Override
    public String toString() {
        return "ConsultantDto{" +
                "consultant_num=" + consultant_num +
                ", name='" + name + '\'' +
                ", personal_num=" + personal_num +
                ", consultant_content='" + consultant_content + '\'' +
                ", consultant_type=" + consultant_type +
                ", consultant_date=" + consultant_date +
                '}';
    }

    public ConsultantEntity toEntity(){

        ConsultantEntity consultantEntity=new ConsultantEntity(consultant_num,name,personal_num,consultant_content,consultant_type,consultant_date);
        return consultantEntity;

    }
}

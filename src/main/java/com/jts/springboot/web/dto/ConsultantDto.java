package com.jts.springboot.web.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.jts.springboot.domain.entity.ConsultantEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class ConsultantDto {
    private Long c_consultant_num;
    private String c_name;
    private Long c_personal_num;
    private String consultant_content;
    private  int consultant_type;
    private LocalDate consultant_date;
    private String negative;



    public ConsultantDto(@JsonProperty("c_consultant_num") Long c_consultant_num,@JsonProperty("c_name") String c_name,
                         @JsonProperty("c_personal_num") Long c_personal_num,@JsonProperty("consultant_content") String consultant_content,
                         @JsonProperty("consultant_type") int consultant_type,@JsonProperty("consultant_date")
            LocalDate consultant_date,@JsonProperty("negative") String negative) {
        this.c_consultant_num = c_consultant_num;
        this.c_name = c_name;
        this.c_personal_num =c_personal_num;
        this.consultant_content = consultant_content;
        this.consultant_type=consultant_type;
        this.consultant_date = consultant_date;
        this.negative = negative;
    }

    @Override
    public String toString() {
        return "ConsultantDto{" +
                "c_consultant_num=" + c_consultant_num +
                ", c_name='" + c_name + '\'' +
                ", c_personal_num=" + c_personal_num +
                ", consultant_content='" + consultant_content + '\'' +
                ", consultant_type=" + consultant_type +
                ", consultant_date=" + consultant_date +
                ", negative='" + negative + '\'' +
                '}';
    }

    public ConsultantEntity toEntity(){

        ConsultantEntity consultantEntity=new ConsultantEntity(c_consultant_num,c_name,c_personal_num,consultant_content,consultant_type,consultant_date,negative);
        return consultantEntity;

    }
}

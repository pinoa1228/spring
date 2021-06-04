package com.jts.springboot.web;

import com.jts.springboot.domain.entity.ConsultantEntity;
import com.jts.springboot.domain.entity.UserEntity;
import com.jts.springboot.domain.repository.ConsultantRepository;
import com.jts.springboot.domain.repository.UserRepository;
import com.jts.springboot.web.dto.ConsultantDto;
import com.jts.springboot.web.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ConsultantController {

    @Autowired//스트링 부트가 미리 생성해놓은 객체를 가져다가 자동연결
    private ConsultantRepository consultantRepository;


    public ConsultantController(ConsultantRepository consultantRepository) {

        this.consultantRepository = consultantRepository;
    }


    @PostMapping("jts/content")
    @ResponseStatus(value= HttpStatus.OK)
    public ConsultantEntity join(@RequestBody ConsultantDto consultantDto){

        System.out.println(consultantDto.toString());

        //dto를 entity로 변환
        ConsultantEntity user=consultantDto.toEntity();
        System.out.println(user.toString());

        //repository에게 entity를 db안에 저장하게 함
        ConsultantEntity saved = consultantRepository.save(user);

        return saved;
    }

}

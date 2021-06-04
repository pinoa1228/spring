package com.jts.springboot.web;

import com.jts.springboot.domain.entity.UserEntity;
import com.jts.springboot.domain.repository.UserRepository;
import com.jts.springboot.web.dto.UserDto;
import com.jts.springboot.web.dto.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {

    @Autowired//스트링 부트가 미리 생성해놓은 객체를 가져다가 자동연결
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/")
    public String login(){

        return "new";
    }
        @PostMapping("jts/join")
    @ResponseStatus(value= HttpStatus.OK)
    public UserEntity join(@RequestBody UserDto userDto){


        System.out.println(userDto.toString());
         //dto를 entity로 변환
        UserEntity user=userDto.toEntity();
        System.out.println(user.toString());

        //repository에게 entity를 db안에 저장하게 함
        UserEntity saved = userRepository.save(user);

        return saved;
    }

    //로그인 체크하는 Controller
    @PostMapping("jts/signIn")
        public UserEntity signIn(@RequestBody UserDto userDto) {
        System.out.println(userDto.getId() + userDto.getPw());
        String inputId = userDto.getId();
        String inputPw = userDto.getPw();

        UserEntity login = userRepository.findUserEntity(inputId, inputPw);
        //UserEntity login = userRepository.findByIdAndPw(inputId, inputPw);
        log.info("id : {} , pw : {}", inputId, inputPw);

            return login;//안드에서 다음화면 넘어가는 것

        }

        @GetMapping("jts/idCheck")
    public ResponseEntity<Boolean> checkIdDuplicate(@PathVariable String id){
        return ResponseEntity.ok(UserService.checkIdDuplicate(id));
        }
    }




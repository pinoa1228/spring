package com.jts.springboot.web;

import com.jts.springboot.domain.entity.UserEntity;
import com.jts.springboot.domain.repository.UserRepository;
import com.jts.springboot.web.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {

    @Autowired//스트링 부트가 미리 생성해놓은 객체를 가져다가 자동연결
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/jts")
    public String login(){

        return "login";
    }
    @PostMapping("jts/join")
    @ResponseStatus(value= HttpStatus.OK)
    public String join(@RequestBody UserDto userDto){


        System.out.println(userDto.toString());
         //dto를 entity로 변환
        UserEntity user=userDto.toEntity();
        System.out.println(user.toString());

        //repository에게 entity를 db안에 저장하게 함
        UserEntity saved = userRepository.save(user);

        System.out.println(saved);

        return "";
    }

    //로그인 체크하는 Controller
    @PostMapping("jts/signIn")
        public String signIn(String inputid, String inputpw) {
            log.info("id : {} , pw : {}", inputid, inputpw);
            UserEntity userRepository = this.userRepository.findUserEntity(inputid, inputpw);
            if(userRepository != null) {
                return "loginOK";//안드에서 다음화면 넘어가는 것으로 수정해야함
            }
            return "loginFail";//에러화면 or 다시 로그인페이지 뜨는것으로 수정해야함
        }

    }


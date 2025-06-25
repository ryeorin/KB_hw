package org.scoula.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 싱글톤으로 만들어주고, 스프링에 이 클래스가 컨트롤러 역할을 하는
// 클래스라고 등록시켜줌
@Controller
public class HomeController {

    //요청 하나당 함수 하나
    //요청이 어떻게 들어오는지 설정
    //어떤 함수를 부를지 정의함

    @GetMapping("/") // "/" 주소로 get 요청이 들어오면
    public String home() {
        // 스프링이 핸들러매퍼에 주소와 방식에 따른 어떤 컨트롤러의 메서드를
        // 불러야할지를 자동으로 등록시켜줌

        System.out.println("HomeController");
        return "index"; //viwe파일 이름 프론트 컨트롤러에서 리턴함

    }

}

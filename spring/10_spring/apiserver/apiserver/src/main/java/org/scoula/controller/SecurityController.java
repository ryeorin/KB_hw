package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Log4j2
@RequestMapping("/security")
@Controller
public class SecurityController {

    @GetMapping("/all") // 모두 접근 가능
    public void doAll() {  //void인 경우 /security
        log.info("do all can access everybody");
    }

//    @GetMapping("/member") // MEMBER 또는 ADMIN 권한 필요
//    public void doMember() {
//        log.info("logined member");
//    }

    @GetMapping("/admin") // ADMIN 권한 필요
    public void doAdmin() {
        log.info("admin only");
    }

    @GetMapping("/login")
    public void login() {

        log.info("login page");

    }

    @GetMapping("/logout")
    public void logout() {

        log.info("logout page");

    }

    @GetMapping("/member") // MEMBER 또는 ADMIN 권한 필요
    public void doMember(Principal principal) {
        log.info("logined member details info >>" + principal);
        log.info("logined member details info >>" + principal.getName());
    }


}

package org.scoula.ex03.controller;

import lombok.extern.log4j.Log4j2;
import org.scoula.ex03.dto.SampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/sample") //sample로 잡는거
@Log4j2 //log도 찍어야돼

public class SampleController {
    @RequestMapping("")
    public void basic(){
        log.info("basic......");
    }
    //get, post 요청에 호출되는 basicGet() 메서드 작성
    @RequestMapping(value="/basic",method={RequestMethod.GET,RequestMethod.POST})
    public void basicGet(){
        log.info("basic get......");
    }
    @RequestMapping("/basicOnlyGet")
    public void basicGet2(){
        log.info("basic get2.......");
    }

    @GetMapping("/ex04")
    public String ex04(SampleDTO dto, @ModelAttribute("page") int page){
        log.info("dto:"+dto);
        log.info("page:"+page);
        return "sample/ex04";
    }

    @GetMapping("/ex05")
    public void ex05(){
        log.info("ex05......");
    }

    @GetMapping("/ex06")
    public String ex06(RedirectAttributes ra){
        log.info("ex06......");
        ra.addAttribute("name","AAA");
        ra.addAttribute("age",10);

        return "redirect:/sample/ex06-2";
    }

    @GetMapping("/ex06-2")
    public void test(){

    }

}

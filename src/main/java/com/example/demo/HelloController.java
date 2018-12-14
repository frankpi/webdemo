package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping("")
    public String hello() {
        return "redirect:/hello.html";
    }

//    @GetMapping("/hello")
//    public String hello2(HashMap<String, Object> map) {
//        map.put("hello", "欢迎进入HTML页面");
//        return "hello";
//    }
}
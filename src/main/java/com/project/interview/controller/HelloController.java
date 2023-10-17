package com.project.interview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController //리액트는 api에서 JSON으로 소통하기 때문
public class HelloController {
    @GetMapping("/hello")
    public List<String> hello(){  //return 형식에 따라 String, <String> 등등
        return Arrays.asList("서버 포트는 8080", "리액트 포트는 3000");
    }
}

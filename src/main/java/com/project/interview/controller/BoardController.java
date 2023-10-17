package com.project.interview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BoardController {
    @GetMapping("/root")
    @ResponseBody //자바 객체를 HTTP 응답 본문의 객체로 변환 하여 클라이언트로 전송시키는 역할
    public String boardWriteForm() {
        return "root";
    }

    @GetMapping("/hellow")
    @ResponseBody
    public String helloForm() {
        return "hellow";
    }

    @GetMapping("/index")
    @ResponseBody
    public String rootForm() {
        return "indexPage";
    }
}

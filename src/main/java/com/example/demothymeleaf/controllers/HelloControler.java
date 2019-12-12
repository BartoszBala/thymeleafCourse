package com.example.demothymeleaf.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloControler {

//    @GetMapping("/hi")
//    public String get(){
//
//
//        return "index";
//    }

    @GetMapping("/hi2")
    public String get2(){


        return "index";
    }

//    @GetMapping("/product")
//    public String get3(){
//
//
//        return "product";
//    }
}

package com.example.demo2.com.example.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Helloworldcontroller {
    @RequestMapping("/")
    public String home(){
        return "Hello, Zbook!";
    }
}
package com.djole.zev.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zev")
public class UserController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!!";
    }
}

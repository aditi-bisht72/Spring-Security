package com.eazybytes.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String sayWelcome()
    {
        //return "Hie welcome to spring application without security";
     return "Hie welcome to spring application with security";
    }
}

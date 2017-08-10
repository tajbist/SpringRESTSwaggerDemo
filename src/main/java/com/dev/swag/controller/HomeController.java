package com.dev.swag.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = {"/","/api/home"})
    public String home(){
        return "Hello Swagger Home";
    }
}

package com.said.userservicee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping
    public String index(){
        System.out.println("İstek karşılandı");
        return "Hello world";
    }
}

package com.juaracoding.msajspringbootf.controller;/*
Created By IntelliJ IDEA 2022.3.2 (Ultimate Edition)
Build #IU-223.8617.56, built on January 26, 2023
@Author Syarifudin a.k.a. Muhamad Syarifuidn
Java Developer
Created on 06/02/2023 21:48
@Last Modified 06/02/2023 21:48
Version 1.1
*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class HelloController{
    @GetMapping("/")
    public String firstPage() {

        return "welcome";
    }
}

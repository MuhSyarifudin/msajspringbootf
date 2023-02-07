package com.juaracoding.msajspringbootf.controller;/*
Created By IntelliJ IDEA 2022.3.2 (Ultimate Edition)
Build #IU-223.8617.56, built on January 26, 2023
@Author Syarifudin a.k.a. Muhamad Syarifuidn
Java Developer
Created on 06/02/2023 21:44
@Last Modified 06/02/2023 21:44
Version 1.1
*/
import com.juaracoding.msajspringbootf.model.Welcome;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class WelcomeController {

    @PostMapping("/v1/welcomez/{news}")
    String welcomeMessage(
            @RequestParam String testX,
            @PathVariable("news") String newz,
            @RequestBody Welcome welcome
    ){

        System.out.println("Request Param testX : "+testX);
        System.out.println("Path Variable news : "+newz);
        System.out.println("Request Body welcome var nama : "+welcome.getNama());
        System.out.println("Request Body welcome var alamat : "+welcome.getAlamat());
        System.out.println("Request Body welcome var jenisKelamin : "+welcome.getJenisKelamin());
        System.out.println("Request Body welcome object innerWelcome var innerWelcomeX : "+welcome.getWelcomeDaleman().getInnerWelcomeX());
        System.out.println("Request Body welcome object innerWelcome var innerWelcomeY : "+welcome.getWelcomeDaleman().getInnerWelcomeY());
        System.out.println("Request Body welcome object innerWelcome var innerWelcomeZ : "+welcome.getWelcomeDaleman().getInnerWelcomeZ());

        return "OK";
    }

    @GetMapping("/v2")
    String welcomeMessageV2(){


        return "";
    }
}
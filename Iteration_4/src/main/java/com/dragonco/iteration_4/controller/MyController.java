package com.dragonco.iteration_4.controller;


import com.dragonco.iteration_4.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    private MyService service;

    @GetMapping("/")
    public String hello() {
        return "Hello world";
    }


    @GetMapping("/data")
    public String getCachedData() {
        String data = service.getData();
        return data;
    }




    @Autowired
    public void setService(MyService service) {
        this.service = service;
    }
}

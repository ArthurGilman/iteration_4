package com.dragonco.iteration_4.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MyService {


    @Cacheable("cachedData")
    public String getData() {
        System.out.println("Getting data");
        return "Cached data";
    }



}

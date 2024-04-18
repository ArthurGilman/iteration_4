package com.dragonco.iteration_4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Consumer {
    private MyService service;

    @Autowired
    public Consumer(MyService service) {
        this.service = service;
    }

    public void callCachedData() {
        String cached = service.getData();
        System.out.println("using cache: " + cached);
    }

}

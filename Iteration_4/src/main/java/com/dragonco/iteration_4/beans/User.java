package com.dragonco.iteration_4.beans;

import jakarta.annotation.PreDestroy;
import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class User {
    private static Long genId = 0L;

    @Getter
    private final Long id;

    public User() {
        id = ++genId;
    }


    @PreDestroy
    public void notifyExit() {
//        log.debug("user id - ", + id + " left");
        System.out.println("user id - " + id + " left");
    }
}

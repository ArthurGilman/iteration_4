package com.dragonco.iteration_4.generics;

public class Dog extends Pet implements Swimmable{
    @Override
    public void say() {
        System.out.println("dog voice");;
    }
}

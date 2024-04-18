package com.dragonco.iteration_4.generics;

import java.util.List;

public class Generics {


    public static <T extends Pet & Swimmable> void method1(List<T> list) {
        list.forEach(Pet::say);
    }

    public static void method2(List<? extends Pet> list) {
//        list.set(1, new Pet());
        for (int i = 0; i < list.size(); i++) {
            list.get(i).say();
        }
    }
    public static void method3(List<? super Pet> list) {
//        Pet pet = list.get(1);
        list.add(new Cat());
        Pet pet = new Pet();
    }

}

package com.company;

import static org.junit.jupiter.api.Assertions.*;

class GoodDogTest {

    public static void main(String[] args) {

        GoodDog one=new GoodDog();
        one.setSizet(70);

        GoodDog two=new GoodDog();
        two.setSizet(8);

        System.out.println("Dog one: "+one.getSize());
        System.out.println("Dog two: "+two.getSize());

        one.bark();
        two.bark();

    }

}
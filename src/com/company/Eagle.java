package com.company;

public class Eagle extends Animal {

    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void method() {
        System.out.println(getClass().getSimpleName() + ": Бийик учат");
    }

    public void fly() {
        System.out.println("Бийик учат");
    }
}

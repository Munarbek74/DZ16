package com.company;

public class Turtle extends Animal{

    public Turtle(String name, int age) {
        super(name, age);
    }

    @Override
    public void method() {
        System.out.println(getClass().getSimpleName() + ": жай сузот");
    }

    public void swim() {
        System.out.println("жай сузот");
    }
}

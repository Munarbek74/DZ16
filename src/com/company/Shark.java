package com.company;

public class Shark  extends Animal{

    public Shark(String name, int age) {
        super(name,age);
    }

    @Override
    public void method() {
        System.out.println(getClass().getSimpleName() + ": Адамга коркунуч туудурат");
    }

    public void attack() {
        System.out.println("Адамга коркунуч туудурат");
    }
}

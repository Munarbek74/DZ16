package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal[] animals = {
                new Shark("Акула", 25),
                new Shark("Акула1", 25),
                new Shark("Акула2", 25),
                new Turtle("Тартилла", 55),
                new Turtle("Тартилла1", 55),
                new Turtle("Тартилла2", 55),
                new Eagle("Орел", 32),
                new Eagle("Орел1", 32),
                new Eagle("Орел2", 32)

        };

        for (Animal a: animals) {
            if (a instanceof Animal)
            a.method();
            }

        Shark[] sharks = new Shark[3];
        Turtle[] turtles = new Turtle[3];
        Eagle[] eagles = new Eagle[3];
        }
    }


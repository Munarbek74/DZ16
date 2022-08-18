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
        sharks[0] = new Shark("Акула", 25);
        sharks[1] = new Shark("Акула1", 25);
        sharks[2] = new Shark("Акула2", 25);
        Turtle[] turtles = new Turtle[3];
        turtles[0] = new Turtle("Тартилла", 55);
        turtles[1] = new Turtle("Тартилла1", 55);
        turtles[2] = new Turtle("Тартилла2", 55);
        Eagle[] eagles = new Eagle[3];
        eagles[0] = new Eagle("Орел", 32);
        eagles[1] = new Eagle("Орел1", 32);
        eagles[2] = new Eagle("Орел2", 32);

        }


    }


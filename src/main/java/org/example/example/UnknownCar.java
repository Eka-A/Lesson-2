package org.example.example;

public class UnknownCar implements Car {
    public Object draw(String color) {
        System.out.println("UnknownCar color: " + color);

        return color;
    }
}
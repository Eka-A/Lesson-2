package org.example.example;

public class SportCar implements Car {
    public Object draw(String color) {
        System.out.println("SportCar color: " + color);
        return color;
    }
}

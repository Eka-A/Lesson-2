package org.example.example;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Car {
    private List<Car> cars = new ArrayList<Car>();
    public Object draw(String color) {
        for(Car car : cars) {
            car.draw(color);
        }
        return color;
    }

    public void add(Car s){
        this.cars.add(s);
    }
    public void clear(){
        System.out.println();
        this.cars.clear();
    }
}
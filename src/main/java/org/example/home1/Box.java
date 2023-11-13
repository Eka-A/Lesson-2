package org.example.home1;

import org.example.home.subBasket;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Box implements SubBox {

    static List<SubBox> toys = new ArrayList<>();

    public void addToy(SubBox element){
        toys.add(element);
    }
    @Override
    public void Construct(String name, float price) {

    }

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public void setPrice(Float price) {

    }

    @Override
    public Float getPrice(Float price) {
        return price;
    }

    public Integer getSum() {
        AtomicReference<Integer> result = new AtomicReference<>(0);
        toys.forEach(subBasket -> {result.set(result.get() + subBasket.getSum());
        });
        return result.get();
    }
}

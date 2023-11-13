package org.example.home;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Basket implements subBasket{

    static List<subBasket> fruits = new ArrayList<>();



    public void add(subBasket element){
        fruits.add(element);
    }

    @Override
    public Integer getSum() {
            AtomicReference<Integer> result = new AtomicReference<>(0);
            fruits.forEach(subBasket -> {result.set(result.get() + subBasket.getSum());
            });
            return result.get();
    }
}

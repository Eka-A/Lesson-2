package org.example.home;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class BasketTest {
    @Test
    public void ComplexBasketTest() {
        Basket basket = new Basket();
        basket.add(new Fruits(0));
        basket.add(new Fruits(10));

        Integer result = basket.getSum();

        Assertions.assertEquals(10, result);
    }

}

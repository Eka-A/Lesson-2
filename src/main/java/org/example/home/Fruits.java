package org.example.home;

public class Fruits implements subBasket{
    public Integer sum;

    public Fruits (Integer sum){this.sum = sum; }

    @Override
    public Integer getSum() {
        return sum;
    }


}

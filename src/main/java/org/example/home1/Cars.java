package org.example.home1;

public class Cars implements SubBox{
        public String name;
        public Float price;
        public Integer sum;
        @Override
        public void Construct(String name, float price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String getName(String name) {
            return name;
        }

        @Override
        public void setPrice(Float price) {
            this.price = price;
        }

        @Override
        public Float getPrice(Float price) {
            return price;
        }

    @Override
    public Integer getSum() {
        return sum;
    }
}


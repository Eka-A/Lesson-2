package org.example.example;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class exampleTest {

    @Test
    public void ComplexTest() {
        Car sportCar = new SportCar();
        Car unknownCar = new UnknownCar();
        Drawing drawing = new Drawing();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        String res = (String) drawing.draw("black");

        Assertions.assertEquals(res,"black");


        }
    }


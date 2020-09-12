package com.company;

public class MercedesCar extends Car {
    MercedesCar() {
        super(CarType.Mercedes);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building a Mercedes car");

    }
}

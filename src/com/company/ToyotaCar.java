package com.company;

class ToyotaCar extends Car {
    ToyotaCar() {
        super(CarType.Toyota);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Building a Toyota car");

    }
}
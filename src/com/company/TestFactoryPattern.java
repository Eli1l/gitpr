package com.company;
public class TestFactoryPattern {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.Mercedes));
        System.out.println(CarFactory.buildCar(CarType.Toyota));
    }
}

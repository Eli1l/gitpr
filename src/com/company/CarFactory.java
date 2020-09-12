package com.company;
public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case Mercedes:
                car = new MercedesCar();
                break;
            case Toyota:
                car = new ToyotaCar();
                break;
            default:

                break;
        }
        return car;
    }
}
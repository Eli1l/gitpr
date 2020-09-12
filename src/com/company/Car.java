package com.company;

public abstract class Car<string> {
    private string model;
    private Object MercedesModels;
    private Object ToyotaModels;
    private CarType Toyota;
    private CarType Mercedes;

    public Car(CarType mercedes) {
    }

    public void MercedesModels(CarType mercedes) {
    }
    public void ToyotaModels(CarType toyota) {
    }

    public void MColor(){
        Mercedes = (CarType) MercedesModels;
    }
    public void TColor(){
        Toyota = (CarType) ToyotaModels;
    }
    protected void construct(CarType model){

        this.model = (string) model;
    }
    public CarType getModel(){
        return (CarType) model;
    }
    public void setModel(CarType model){
        this.model = (string) model;
    }

    protected abstract void construct();
}


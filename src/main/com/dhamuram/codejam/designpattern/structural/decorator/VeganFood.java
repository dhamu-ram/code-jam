package com.dhamuram.codejam.designpattern.structural.decorator;

public class VeganFood implements Food {

    double foodPrice = 50.0;

    @Override
    public String prepareFood() {
        return "Veg Food";
    }

    public double foodPrice() {
        return foodPrice;
    }
}

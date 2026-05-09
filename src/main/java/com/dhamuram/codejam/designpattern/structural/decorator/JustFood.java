package com.dhamuram.codejam.designpattern.structural.decorator;

public class JustFood implements Food {

    double baseFoodPrice = 50.0;

    @Override
    public String prepareFood() {
        return "Food Type : ";
    }

    public double foodPrice() {
        return baseFoodPrice;
    }
}

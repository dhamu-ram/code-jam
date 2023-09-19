package com.dhamuram.codejam.designpattern.structural.decorator;

public class IndianFood extends FoodDecorator {

    public IndianFood(Food latestFood) {
        super(latestFood);
    }

    public String prepareFood() {
        return super.prepareFood() + " Indian Food";
    }

    public double foodPrice() {
        return super.foodPrice() + 30.0;
    }
}

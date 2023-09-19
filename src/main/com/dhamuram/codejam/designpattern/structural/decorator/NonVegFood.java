package com.dhamuram.codejam.designpattern.structural.decorator;

public class NonVegFood extends FoodDecorator {

    public NonVegFood(Food latestFood) {
        super(latestFood);
    }

    public String prepareFood() {
        return super.prepareFood() + " Non Vegetarian Food";
    }

    public double foodPrice() {
        return super.foodPrice() + 50.0;
    }
}

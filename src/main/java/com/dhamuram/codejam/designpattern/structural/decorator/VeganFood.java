package com.dhamuram.codejam.designpattern.structural.decorator;

public class VeganFood extends FoodDecorator {

    public VeganFood(Food latestFood) {
        super(latestFood);
    }

    public String prepareFood() {
        return super.prepareFood() + "Vegan Food";
    }

    public double foodPrice() {
        return super.foodPrice();
    }
}

package com.dhamuram.codejam.designpattern.structural.decorator;

public abstract class FoodDecorator implements Food {

    private final Food latestFood;

    public FoodDecorator(Food latestFood) {
        this.latestFood = latestFood;
    }


    public String prepareFood() {
        return latestFood.prepareFood();
    }

    public double foodPrice() {
        return latestFood.foodPrice();
    }
}

package com.dhamuram.codejam.designpattern.structural.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {

        Food veganFood = new VeganFood();

        System.out.println(veganFood.prepareFood());
        System.out.println(veganFood.foodPrice());

        // Food indianFood = new IndianFood();
    }
}

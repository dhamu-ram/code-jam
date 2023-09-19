package com.dhamuram.codejam.designpattern.structural.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {

        Food veganFood = new VeganFood();

        System.out.println(veganFood.prepareFood());
        System.out.println(veganFood.foodPrice());

        Food indianFood = new IndianFood(new VeganFood());
        System.out.println(indianFood.prepareFood());
        System.out.println(indianFood.foodPrice());

        Food nonVegFood = new NonVegFood(new VeganFood());
        System.out.println(nonVegFood.prepareFood());
        System.out.println(nonVegFood.foodPrice());

    }
}

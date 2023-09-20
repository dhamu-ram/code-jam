package com.dhamuram.codejam.designpattern.structural.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {

        Food justFood = new JustFood();

        System.out.println(justFood.prepareFood());
        System.out.println(justFood.foodPrice());

        Food indianFood = new IndianFood(new JustFood());
        System.out.println(indianFood.prepareFood());
        System.out.println(indianFood.foodPrice());

        Food nonVegFood = new NonVegFood(new JustFood());
        System.out.println(nonVegFood.prepareFood());
        System.out.println(nonVegFood.foodPrice());

        Food veganFood = new VeganFood(new JustFood());
        System.out.println(veganFood.prepareFood());
        System.out.println(veganFood.foodPrice());
    }
}

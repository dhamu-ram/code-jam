package com.dhamuram.codejam.designpattern.creational.factory;

public abstract class Plan {

    protected double rate;

    abstract double getRate();

    public void calculateBill(int units) {
        System.out.println("Unit Rate : " + getRate() + ", Bill Amount : " + (units * getRate()));
    }
}

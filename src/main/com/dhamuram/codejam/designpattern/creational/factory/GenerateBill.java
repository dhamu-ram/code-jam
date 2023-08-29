package com.dhamuram.codejam.designpattern.creational.factory;

public class GenerateBill {

    public static void main(String[] args) {


        GetPlanFactory planFactory = new GetPlanFactory();

        Plan plan = planFactory.getPlan("domestic");

        plan.getRate();
        plan.calculateBill(100);
    }
}

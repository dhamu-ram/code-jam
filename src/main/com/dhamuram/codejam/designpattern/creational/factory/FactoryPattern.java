package com.dhamuram.codejam.designpattern.creational.factory;

import java.io.IOException;

public class FactoryPattern {

    public static void main(String[] args) {

        try {

            GetPlanFactory planFactory = new GetPlanFactory();

            // initialize domestic plan
            Plan domesticPlan = planFactory.getPlan("domestic");
            domesticPlan.calculateBill(100);

            // initialize commercial plan
            Plan commercialPlan = planFactory.getPlan("commercial");
            commercialPlan.calculateBill(100);

            // initialize industrial plan
            Plan industrialPlan = planFactory.getPlan("industrial");
            industrialPlan.calculateBill(100);
        } catch (IOException ioEx) {
            System.out.println(ioEx.getMessage());
        }
    }
}

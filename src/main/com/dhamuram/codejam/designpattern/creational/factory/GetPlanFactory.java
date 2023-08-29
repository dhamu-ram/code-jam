package com.dhamuram.codejam.designpattern.creational.factory;

public class GetPlanFactory {

    public Plan getPlan(String planType) {
        if (planType.isBlank()) {
            return null;
        }

        if (planType.equalsIgnoreCase("domestic")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("commercial")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("industrial")) {
            return new InstitutionalPlan();
        } else {
            return null;
        }
    }
}
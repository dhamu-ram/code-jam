package com.dhamuram.codejam.designpattern.creational.factory;

import java.io.IOException;

public class GetPlanFactory {

    public Plan getPlan(String planType) throws IOException {
        if (planType.isBlank()) {
            throw new IOException();
        }

        if (planType.equalsIgnoreCase("domestic")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("commercial")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("industrial")) {
            return new InstitutionalPlan();
        } else {
            throw new IOException();
        }
    }
}
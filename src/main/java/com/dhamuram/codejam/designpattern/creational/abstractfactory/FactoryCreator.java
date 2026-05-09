package com.dhamuram.codejam.designpattern.creational.abstractfactory;

import java.io.IOException;

public class FactoryCreator {

    public static AbstractFactory getAbstractFactory(String choice) throws IOException {
        if (choice.equalsIgnoreCase("bank")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("loan")) {
            return new LoanFactory();
        } else {
            throw new IOException();
        }
    }
}

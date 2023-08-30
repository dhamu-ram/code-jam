package com.dhamuram.codejam.designpattern.creational.abstractfactory;

import java.io.IOException;

public class BankFactory extends AbstractFactory {

    @Override
    public Bank getBank(String bankName) throws IOException {

        if (bankName.isBlank()) {
            throw new IOException();
        }

        if (bankName.equalsIgnoreCase("boa")) {
            return new BOA();
        } else if (bankName.equalsIgnoreCase("chase")) {
            return new Chase();
        } else if (bankName.equalsIgnoreCase("citi")) {
            return new CITI();
        } else {
            throw new IOException();
        }
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}

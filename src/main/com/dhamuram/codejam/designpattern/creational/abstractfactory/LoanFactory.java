package com.dhamuram.codejam.designpattern.creational.abstractfactory;

import java.io.IOException;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) throws IOException {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}

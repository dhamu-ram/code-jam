package com.dhamuram.codejam.designpattern.creational.abstractfactory;

public class BusinessLoan extends Loan {
    @Override
    double getInterestRate() {
        return 0;
    }
}

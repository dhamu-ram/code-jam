package com.dhamuram.codejam.designpattern.creational.abstractfactory;

public class BusinessLoan extends Loan {

    @Override
    void setInterestRate(double rate) {

        this.rate = rate;
    }
}

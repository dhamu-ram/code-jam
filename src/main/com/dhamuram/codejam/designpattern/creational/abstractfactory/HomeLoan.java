package com.dhamuram.codejam.designpattern.creational.abstractfactory;

public class HomeLoan extends Loan {


    @Override
    double getInterestRate(double rate) {
        return rate;
    }
}

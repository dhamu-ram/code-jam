package com.dhamuram.codejam.designpattern.creational.abstractfactory;

public class EducationLoan extends Loan {


    @Override
    double getInterestRate(double rate) {
        return rate;
    }
}

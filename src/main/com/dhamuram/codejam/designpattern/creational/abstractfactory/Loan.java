package com.dhamuram.codejam.designpattern.creational.abstractfactory;

public abstract class Loan {

    protected double rate;

    abstract double getInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, double tenure) {

        double loanPayment = (loanAmount * tenure * rate) / 100;

        System.out.println("Total Payment Amount : " + loanAmount + ", at the rate : " + rate + "%");
    }
}

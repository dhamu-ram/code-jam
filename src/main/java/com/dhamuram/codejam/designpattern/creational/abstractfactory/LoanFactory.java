package com.dhamuram.codejam.designpattern.creational.abstractfactory;

import java.io.IOException;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) throws IOException {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) throws IOException {

        if (loanType.isEmpty()) {
            throw new IOException();
        }

        if (loanType.equalsIgnoreCase("home")) {
            return new HomeLoan();
        } else if (loanType.equalsIgnoreCase("education")) {
            return new EducationLoan();
        } else if (loanType.equalsIgnoreCase("business")) {
            return new BusinessLoan();
        } else {
            throw new IOException();
        }
    }
}

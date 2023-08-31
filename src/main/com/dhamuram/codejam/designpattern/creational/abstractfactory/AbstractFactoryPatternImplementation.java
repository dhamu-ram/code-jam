package com.dhamuram.codejam.designpattern.creational.abstractfactory;

import java.io.IOException;

public class AbstractFactoryPatternImplementation {
    public static void main(String[] args) {
        try {

            // BOA Home Loan
            Bank boa = FactoryCreator.getAbstractFactory("bank").getBank("boa");
            Loan boaHomeLoan = FactoryCreator.getAbstractFactory("loan").getLoan("home");

            printBankDetails(boa.getBankName());
            boaHomeLoan.setInterestRate(6.10);
            boaHomeLoan.calculateLoanPayment(100000, 240);

            // Citi Education Loan
            Bank citi = FactoryCreator.getAbstractFactory("bank").getBank("citi");
            Loan citiEductaionLoan = FactoryCreator.getAbstractFactory("loan").getLoan("education");

            printBankDetails(citi.getBankName());
            citiEductaionLoan.setInterestRate(5.10);
            citiEductaionLoan.calculateLoanPayment(60000, 120);

            // Chase Business Loan
            Bank chase = FactoryCreator.getAbstractFactory("bank").getBank("chase");
            Loan chaseBusinessLoan = FactoryCreator.getAbstractFactory("loan").getLoan("business");

            printBankDetails(chase.getBankName());
            chaseBusinessLoan.setInterestRate(7.10);
            chaseBusinessLoan.calculateLoanPayment(100000000, 60);

        } catch (IOException ioEx) {
            System.out.println(ioEx.getMessage());
        }
    }

    private static void printBankDetails(String bankName) {
        System.out.println("--");
        System.out.println("* Your Bank : " + bankName);
    }
}

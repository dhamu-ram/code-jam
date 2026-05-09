package com.dhamuram.codejam.designpattern.structural.adapter;

public class AdapterPattern {

    public static void main(String[] args) {

        CreditCard creditCardOne = new BankCustomer("Chase", "John", 10000001L);

        creditCardOne.showCreditCard();
        creditCardOne.showBankDetails();

        CreditCard creditCardTwo = new BankCustomer("BofA", "Elton", 20000001L);

        creditCardTwo.showCreditCard();
        creditCardTwo.showBankDetails();
    }
}

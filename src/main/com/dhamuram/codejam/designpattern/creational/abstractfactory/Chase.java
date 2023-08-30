package com.dhamuram.codejam.designpattern.creational.abstractfactory;

public class Chase implements Bank {

    final String bankName;

    Chase() {
        bankName = "JP Morgan Chase";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}

package com.dhamuram.codejam.designpattern.creational.abstractfactory;

public class CITI implements Bank {

    final String bankName;

    CITI() {
        bankName = "Citi";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}

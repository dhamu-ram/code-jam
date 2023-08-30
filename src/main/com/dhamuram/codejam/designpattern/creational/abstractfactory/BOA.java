package com.dhamuram.codejam.designpattern.creational.abstractfactory;

public class BOA implements Bank {

    final String bankName;

    BOA() {
        bankName = "Bank of America";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}

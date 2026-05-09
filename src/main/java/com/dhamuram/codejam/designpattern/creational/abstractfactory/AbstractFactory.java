package com.dhamuram.codejam.designpattern.creational.abstractfactory;

import java.io.IOException;

public abstract class AbstractFactory {

    public abstract Bank getBank(String bankName) throws IOException;

    public abstract Loan getLoan(String loanType) throws IOException;
}

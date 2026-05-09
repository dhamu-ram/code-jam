package com.dhamuram.codejam.designpattern.structural.adapter;

public class BankCustomer extends BankDetails implements CreditCard {

    String bankName;
    String accHolderName;
    long accHolderNumber;

    BankCustomer(String bankName, String accHolderName, long accHolderNumber) {
        this.bankName = bankName;
        this.accHolderName = accHolderName;
        this.accHolderNumber = accHolderNumber;
    }

    public void showBankDetails() {
        setBankName(bankName);
        System.out.println("Bank Details : " + getBankName());
    }

    public void showCreditCard() {
        setAccHolderName(accHolderName);
        setAccNumber(accHolderNumber);
        System.out.println("Credit Details - Holder Name : " + getAccHolderName() + ", Account No : " + getAccNumber());
    }
}

package com.dhamuram.codejam.designpattern.creational.builder;

public class Sony extends Company {

    @Override
    public String Pack() {
        return "Sony CD";
    }

    @Override
    public int price() {
        return 30;
    }
}

package com.dhamuram.codejam.designpattern.creational.builder;

public class Samsung extends Company {

    @Override
    public String Pack() {
        return "Samsung CD";
    }

    @Override
    public int price() {
        return 20;
    }
}

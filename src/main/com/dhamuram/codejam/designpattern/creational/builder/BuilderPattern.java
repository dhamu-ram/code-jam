package com.dhamuram.codejam.designpattern.creational.builder;

public class BuilderPattern {

    public static void main(String[] args) {

        CDBuilder cdBuilder = new CDBuilder();

        CDType samsungCD = cdBuilder.buildSamsungCD();
        samsungCD.showItem();

        CDType sonyCD = cdBuilder.buildSonyCD();
        sonyCD.showItem();
    }
}

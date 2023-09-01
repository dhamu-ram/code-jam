package com.dhamuram.codejam.designpattern.creational.builder;

public class CDBuilder {

    public CDType buildSonyCD() {
        return new CDType();
    }

    public CDType buildSamsungCD() {
        return new CDType();
    }
}

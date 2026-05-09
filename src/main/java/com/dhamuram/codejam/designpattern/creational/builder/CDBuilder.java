package com.dhamuram.codejam.designpattern.creational.builder;

public class CDBuilder {

    public CDType buildSonyCD() {
        CDType cdType = new CDType();
        cdType.addCDS(new Sony());
        return cdType;
    }

    public CDType buildSamsungCD() {
        CDType cdType = new CDType();
        cdType.addCDS(new Samsung());
        return cdType;
    }
}

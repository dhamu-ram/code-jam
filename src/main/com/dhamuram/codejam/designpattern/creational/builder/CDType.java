package com.dhamuram.codejam.designpattern.creational.builder;

import java.util.ArrayList;

public class CDType {

    private final ArrayList<Packaging> cds = new ArrayList<>();

    public void addCDS(Packaging packaging) {
        cds.add(packaging);
    }

    public void getCost() {
        for (Packaging packaging : cds) {
            packaging.price();
        }
    }

    public void showItem() {
        for (Packaging packaging : cds) {
            System.out.println("CD Name : " + packaging.Pack() + ", Price : " + packaging.price());
        }
    }
}

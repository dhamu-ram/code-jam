package com.dhamuram.codejam.general;

public class ImmutableClass {

    private final String name;

    ImmutableClass(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        
        ImmutableClass immutableClass = new ImmutableClass("New Class");

        System.out.println("Value from the Immutable Class : " + immutableClass.getName());
    }
}

package com.dhamuram.codejam.java.eight;

@FunctionalInterface
interface FuncInterface {

    int multiply(int a, int b);
}

public class FunctionalInterfaceSample {

    public static void main(String[] args) {

        FuncInterface Total = (a, b) ->  a * b;

        // simple operation of multiplication of 'a' and 'b'
        System.out.println("Result: " + Total.multiply(30, 60));
    }
}
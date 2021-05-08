package com.dhamuram.java.codejam;

import java.util.Arrays;
import java.util.List;

public class JavaLambdaExpressions {
    public static void main(String[] args) {

        // Define an Integer Array
        Integer[] intArray = {21, 23, 34, 45, 56};

        // Convert the Array as List
        List<Integer> intList = Arrays.asList(intArray);

        // Lambda Expression Implementation.
        intList.forEach(i -> computeArea(i));
    }

    static void computeArea(Integer side) {
        System.out.println("Area of the square of side " + side + " is : " + side * side);
    }
}

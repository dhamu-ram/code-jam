package com.dhamuram.java.codejam;

import java.util.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        Optional<String> string = Optional.empty();

        if (string == null) {
            System.out.println("Empty !!!");
        }

        string = Optional.of("Assign");

        if (string != null) {
            System.out.println("Full : " + string);
        }

    }
}

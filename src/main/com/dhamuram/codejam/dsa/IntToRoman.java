package com.dhamuram.java.codejam.macode;

public class IntToRoman {

    public static void main(String[] args) {
        String romanString = "MCMXCIV";

        // I = 1
        // V = 5
        // X = 10
        // L = 50
        // C = 100
        // M = 1000

        IntToRoman intToRoman = new IntToRoman();
        int romanInteger = intToRoman.romanToInt(romanString);
        System.out.println(romanInteger);
    }

    public int romanToInt(String s) {

        int number = 0;

        // using simple for-loop
        for (int i = 0; i < s.length(); i++) {

            String romanCurrent = s.substring(i, i + 1);
            String romanPrevious = "";

            if (i > 0) {
                romanPrevious = s.substring(i - 1, i);
            }

            if (romanCurrent.equals("I")) {
                number = number + 1;

            } else if (romanCurrent.equals("V")) {
                number = number + 5;

                if (i > 0 && romanCurrent.equals("V") && romanPrevious.equals("I")) {
                    number = number - 2;
                }
            } else if (romanCurrent.equals("X")) {
                number = number + 10;

                if (i > 0 && romanCurrent.equals("X") && romanPrevious.equals("I")) {
                    number = number - 2;
                }
            } else if (romanCurrent.equals("L")) {
                number = number + 50;

                if (i > 0 && romanCurrent.equals("L") && romanPrevious.equals("X")) {
                    number = number - 20;
                }

            } else if (romanCurrent.equals("C")) {
                number = number + 100;

                if (i > 0 && romanCurrent.equals("C") && romanPrevious.equals("X")) {
                    number = number - 20;
                }
            } else if (romanCurrent.equals("D")) {
                number = number + 500;

                if (i > 0 && romanCurrent.equals("D") && romanPrevious.equals("C")) {
                    number = number - 200;
                }
            } else if (romanCurrent.equals("M")) {
                number = number + 1000;

                if (i > 0 && romanCurrent.equals("M") && romanPrevious.equals("C")) {
                    number = number - 200;
                }
            }
        }

        return number;
    }
}

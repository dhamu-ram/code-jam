package com.dhamuram.java.codejam.macode;

public class IsPalindrome {
    public static void main(String[] args) {

        boolean result = IsPalindrome.isPalindrome(0);
        System.out.println(result);

        boolean resultOne = IsPalindrome.isPalindrome(1221);
        System.out.println(resultOne);

        boolean resultTwo = IsPalindrome.isPalindrome(123456);
        System.out.println(resultTwo);
    }

    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int newNum = 0;
        int modNum = 0;

        while (x > newNum) {
            modNum = x % 10;
            newNum = (newNum * 10) + modNum;

            if (x == newNum) {
                return true;
            }

            x = (x / 10);
        }

        if (x == newNum) {
            return true;
        } else {
            return false;
        }
    }
}
package com.dhamuram.java.codejam.backerbank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    public static void main(String[] args) {
        TimeConversion.timeConversion("07:45:00PM");
    }

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {

        String out = "";

        try {
            // Write your code here
            String pattern = "hh:mm:ssa";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            Date date = date = simpleDateFormat.parse(s);


            String patternOut = "HH:mm:ss";
            SimpleDateFormat simpleDateFormatOut = new SimpleDateFormat(patternOut);
            out = simpleDateFormatOut.format(date);

        } catch (ParseException parseEx) {
            System.out.println(parseEx);
        }

        return out;
    }
}

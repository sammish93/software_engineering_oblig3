package no.hiof.samuelcd.tools;

import java.io.IOException;

public class LeapYearCalculator {
    public boolean isLeapYear(int year) {
        boolean answer = false;

        //first checks if year is divisible by 4
        if (year % 4  == 0) {
            //then checks if it's divisible by 4, 100, and 400
            if ((year % 100 == 0) && (year % 400 == 0)) {
                answer = true;
            }
            //finally checks that if it's divisible by 4, but not by 100
            else if (year % 100 != 0) {
                answer =  true;
            }
        }
        //returns true unless not divisible by 4, or divisible by 4 and 100 but not 400
        return answer;
    }
}

package no.hiof.samuelcd.tools;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {

    LeapYearCalculator year = new LeapYearCalculator();


    //Når det er delelig med 4, men ikke 100
    @Test
    public void divisibleByFourButNotOneHundred() {
        assertTrue(year.isLeapYear(2004));
    }

    //Når det er delelig med 400
    @Test
    public void divisibleByFourAndOneHundredAndFourHundred() {
        assertTrue(year.isLeapYear(2000));
    }

    //Når det ikke er delelig med 4
    @Test
    public void notDivisibleByFour() {
        assertFalse(year.isLeapYear(2003));
    }

    //Når det er delelig med 100, men ikke 400
    @Test
    public void divisibleByOneHundredButNotByFourHundred() {
        assertFalse(year.isLeapYear(1900));
    }


    //other possibilities for tests
    @Test
    public void throwsIllegalArgumentExceptionWhenInvalidStringIsConverted() {
        String egg = "egg";
        assertThrows(IllegalArgumentException.class, ()->year.isLeapYear(Integer.parseInt(egg)));
    }

    @Test
    public void ConvertsValidStringFormatToInteger() {
        String stringNumber = "2004";
        assertTrue(year.isLeapYear(Integer.parseInt(stringNumber)));
    }

    @Test
    public void ConvertsValidStringFormatButInvalidYearToInteger() {
        String stringNumber = "2003";
        assertFalse(year.isLeapYear(Integer.parseInt(stringNumber)));
    }

}
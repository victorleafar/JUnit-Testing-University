package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
class LeapYearTest {
    private final LeapYear leapYear = new LeapYear();

    @Test
    public void divisibleBy4_notDivisibleBy100(){
        boolean leap = leapYear.isLeapYear(2016);
        Assertions.assertTrue(leap);  
    }
    @Test
    public void divisibleBy4_100_400(){
        boolean leap = leapYear.isLeapYear(2000);
        assertTrue(leap);
    }
    @Test
    public void notDivisibleBy4(){
        boolean leap = leapYear.isLeapYear(39);
        assertFalse(leap);
    }
    @Test
    public void divisibleBy4_and_100_not_400(){
        boolean leap = leapYear.isLeapYear(1900);
        assertFalse(leap);
    }
}


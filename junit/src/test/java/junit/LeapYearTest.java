package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for LeapYear class.
 */
class LeapYearTest {
    private final LeapYear leapYear = new LeapYear();

    @Test
    public void divisivelPor4_naoDivisivelPor100(){
        boolean leap = leapYear.isLeapYear(2016);
        assertTrue(leap);  
    }
    
    @Test
    public void divisivelPor4_100_400(){
        boolean leap = leapYear.isLeapYear(2000);
        assertTrue(leap);
    }
    
    @Test
    public void naoDivisivelPor4(){
        boolean leap = leapYear.isLeapYear(39);
        assertFalse(leap);
    }
    
    @Test
    public void divisivelPor4_e_100_nao_400(){
        boolean leap = leapYear.isLeapYear(1900);
        assertFalse(leap);
    }
}



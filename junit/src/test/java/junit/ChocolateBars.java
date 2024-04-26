package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class ChocolateBars {
private final ChocolateBars bars = new ChocolateBars();
private Integer calculate(int i, int j, int k) {
    throw new UnsupportedOperationException("Unimplemented method 'calculate'");
}
@Test
void notEnoughBars(){
    assertEquals(-1, bars.calculate(1,1,10));
}
    
@Test
void onlyBigBars(){
    assertEquals(2, bars.calculate(5, 3, 10));
}
@Test
void bigAndSmallBars(){
    assertEquals(2, bars.calculate(5, 3, 17));
}
@Test
void onlySmallBars(){
    assertEquals(3, bars.calculate(4, 2, 3));
}
@Test
void invalidValues(){
    assertEquals(-1, bars.calculate(-1, -1, -1));
}
}

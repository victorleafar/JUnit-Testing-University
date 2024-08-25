package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ChocolateBarsTest {
    private final ChocolateBars bars = new ChocolateBars();

    @Test
    void nãoHáBarrasSuficientes(){
        assertEquals(-1, bars.calculate(1, 1, 10));
    }
    
    @Test
    void apenasBarrasGrandes(){
    assertEquals(0, bars.calculate(0, 5, 10));
}

    
    @Test
    void barrasGrandesPequenas(){
        assertEquals(2, bars.calculate(5, 3, 17));
    }
    
    @Test
    void apenasBarrasPequenas(){
        assertEquals(3, bars.calculate(4, 2, 3));
    }
    
    @Test
    void valoresInválidos(){
        assertEquals(-1, bars.calculate(-1, -1, -1));
    }
}




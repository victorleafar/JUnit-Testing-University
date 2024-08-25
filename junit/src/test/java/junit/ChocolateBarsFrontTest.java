package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBarsFrontTest {
    private final ChocolateBarsFront bars = new ChocolateBarsFront();

    @Test
    public void apenasBarrasPequenas() {
        Assertions.assertEquals(3, bars.calculate(4, 2, 3));  // 4 barras pequenas, 2 barras grandes, total 3 (3 pequenas necessárias)
    }

    @Test
    public void apenasBarrasGrandes() {
        Assertions.assertEquals(0, bars.calculate(5, 3, 10));  // 5 barras pequenas, 3 barras grandes, total 10 (2 grandes necessárias)
    }

    @Test
    public void barrasPequenasBarrasGrandes() {
        Assertions.assertEquals(2, bars.calculate(5, 4, 17));  // 5 barras pequenas, 4 barras grandes, total 17 (3 grandes e 2 pequenas necessárias)
    }

    @Test
    public void barrasInsuficientes() {
        Assertions.assertEquals(-1, bars.calculate(1, 1, 10));  // 1 barra pequena, 1 barra grande, total 10 (insuficiente)
    }

    @Test
    public void valoresEntradaNegativos() {
        Assertions.assertEquals(-1, bars.calculate(-1, -1, -1));  // valores negativos, resultado inválido
    }

    // Casos de teste de fronteira

    @Test
    public void pequenasExatamenteSuficientes() {
        Assertions.assertEquals(2, bars.calculate(2, 0, 2));  // 2 barras pequenas, 0 barras grandes, total 2 (2 pequenas necessárias)
    }

    @Test
    public void grandesExatamenteSuficientes() {
        Assertions.assertEquals(0, bars.calculate(0, 2, 10));  // 0 barras pequenas, 2 barras grandes, total 10 (2 grandes necessárias)
    }

    @Test
    public void grandesETotalZero() {
        Assertions.assertEquals(0, bars.calculate(0, 0, 0));  // 0 barras pequenas, 0 barras grandes, total 0 (nenhuma necessária)
    }

    @Test
    public void pequenasZeroGrandesETotalMultiploDeCinco() {
        Assertions.assertEquals(0, bars.calculate(0, 2, 10));  // 0 barras pequenas, 2 barras grandes, total 10 (2 grandes necessárias)
    }

    @Test
    public void totalNaoMultiploDeCinco() {
        Assertions.assertEquals(1, bars.calculate(1, 1, 6));  // 1 barra pequena, 1 barra grande, total 6 (1 grande e 1 pequena necessária)
    }

    @Test
    public void pequenasInsuficientesPorUm() {
        Assertions.assertEquals(-1, bars.calculate(1, 1, 7));  // 1 barra pequena, 1 barra grande, total 7 (insuficiente)
    }

    @Test
    public void grandesInsuficientesPorUm() {
        Assertions.assertEquals(-1, bars.calculate(2, 1, 11));  // 2 barras pequenas, 1 barra grande, total 11 (insuficiente)
    }
}




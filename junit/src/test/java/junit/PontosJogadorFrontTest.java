package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PontosJogadorFrontTest {
    private final PontosJogadorFront pontos = new PontosJogadorFront();
    
    @Test
    public void poucosPontos() {
        Assertions.assertEquals(30 + 50, pontos.calcularPontosTotais(30, 5));
    }
    
    @Test
    public void muitosPontosPoucasVidas() {
        Assertions.assertEquals(300 + 30, pontos.calcularPontosTotais(300, 1));
    }
    
    @Test
    public void muitosPontosMuitasVidas() {
        Assertions.assertEquals(500 * 3, pontos.calcularPontosTotais(500, 10));
    }
    
    // Teste de fronteira para pontos exatamente 50 e mais de 3 vidas
    @Test
    public void pontosExatamenteCinquentaMuitasVidas() {
        Assertions.assertEquals(50 * 3, pontos.calcularPontosTotais(50, 3));
    }
    
    // Teste de fronteira para pontos exatamente 50 e menos de 3 vidas
    @Test
    public void pontosExatamenteCinquentaPoucasVidas() {
        Assertions.assertEquals(50 + 30, pontos.calcularPontosTotais(50, 2));
    }
    
    // Teste de fronteira para pontos um pouco menos de 50
    @Test
    public void pontosQuarentaENove() {
        Assertions.assertEquals(49 + 50, pontos.calcularPontosTotais(49, 4));
    }
    
    // Teste de fronteira para pontos um pouco mais de 50 e mais de 3 vidas
    @Test
    public void pontosCinquentaEUmMuitasVidas() {
        Assertions.assertEquals(51 * 3, pontos.calcularPontosTotais(51, 3));
    }
    
    // Teste de fronteira para pontos um pouco mais de 50 e menos de 3 vidas
    @Test
    public void pontosCinquentaEUmPoucasVidas() {
        Assertions.assertEquals(51 + 30, pontos.calcularPontosTotais(51, 2));
    }
}


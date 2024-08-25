package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LeftPadUtilsTest {

    // Caso de teste quando str é nulo
    @Test
    public void testLeftPad_NullString() {
        assertNull(LeftPadUtils.leftPad(null, 10, "*"));
    }

    // Caso de teste quando padStr é nulo
    @Test
    public void testLeftPad_NullPadStr() {
    assertEquals("    abc", LeftPadUtils.leftPad("abc", 7, null));
}


    // Caso de teste quando padStr é uma string vazia
    @Test
    public void testLeftPad_EmptyPadStr() {
    assertEquals("    abc", LeftPadUtils.leftPad("abc", 7, ""));
}

    // Caso de teste quando o comprimento de str é menor que size
    @Test
    public void testLeftPad_PaddingRequired() {
        assertEquals("--abc", LeftPadUtils.leftPad("abc", 5, "-"));
    }

    // Caso de teste quando o comprimento de str é igual a size
    @Test
    public void testLeftPad_NoPaddingNeeded() {
        assertEquals("abc", LeftPadUtils.leftPad("abc", 3, "*"));
    }

    // Caso de teste quando padStr é maior que o necessário para preencher
    @Test
    public void testLeftPad_PadStrLongerThanPadding() {
        assertEquals("--abc", LeftPadUtils.leftPad("abc", 5, "--"));
    }

    // Caso de teste quando padStr é repetido para preencher
    @Test
    public void testLeftPad_PadStrRepeats() {
        assertEquals("123abc", LeftPadUtils.leftPad("abc", 6, "123"));
    }

    // Caso de teste quando padStr é um espaço
    @Test
    public void testLeftPad_SpacePadStr() {
    assertEquals("    abc", LeftPadUtils.leftPad("abc", 7, " "));
}

    // Caso de teste quando padStr é um caractere único
    @Test
    public void testLeftPad_SingleCharPadStr() {
        assertEquals("*****abc", LeftPadUtils.leftPad("abc", 8, "*"));
    }
}




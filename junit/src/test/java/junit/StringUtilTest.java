package junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    public void testSubstringsBetweenValidInput() {
        String str = "axcaycazc";
        String open = "a";
        String close = "c";
        String[] expected = {"x", "y", "z"};
        assertArrayEquals(expected, StringUtil.substringsBetween(str, open, close));
    }

    @Test
    public void testSubstringsBetweenNullStr() {
        assertNull(StringUtil.substringsBetween(null, "a", "c"));
    }

    @Test
    public void testSubstringsBetweenEmptyStr() {
        String[] expected = {}; // Espera um array vazio
        assertArrayEquals(expected, StringUtil.substringsBetween("", "a", "c"));
    }

    @Test
    public void testSubstringsBetweenEmptyOpen() {
        assertNull(StringUtil.substringsBetween("axcaycazc", "", "c"));
    }

    @Test
    public void testSubstringsBetweenEmptyClose() {
        assertNull(StringUtil.substringsBetween("axcaycazc", "a", ""));
    }

    @Test
    public void testNoOccurrences() {
    String str = "axcaycazc";
    String open = "x";
    String close = "y";  // Changed "z" to "y" as there's no match with these delimiters
    String[] expected = new String[0]; // Empty array as there's no substring found
    assertArrayEquals(expected, StringUtil.substringsBetween(str, open, close));
}

@Test
    public void testSingleOccurrence() {
    String str = "axcxaycazxc";
    String open = "a";
    String close = "c";
    String[] expected = {"x"};  // Only one substring ("x") found
    assertArrayEquals(expected, StringUtil.substringsBetween(str, open, close));
}
}


package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class NumberUtilsTest {

    private static List<Integer> numbers(int... nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums)
            list.add(n);
        return list;
    }

	@Test
	void testAddWithValidInputs() {
    NumberUtils numberUtils = new NumberUtils();
    assertEquals(numbers(6, 5), numberUtils.add(numbers(2, 3), numbers(4, 2))); // 23 + 42 = 65
    assertEquals(numbers(1, 8, 1), numberUtils.add(numbers(9, 1), numbers(9, 0))); // 19 + 90 = 109
    assertEquals(numbers(0), numberUtils.add(numbers(), numbers())); // 0 + 0 = 0
    assertEquals(numbers(2), numberUtils.add(numbers(), numbers(2))); // 0 + 2 = 2
    assertEquals(numbers(2), numberUtils.add(numbers(2), numbers())); // 2 + 0 = 2
}



    @Test
    void testAddWithEmptyList() {
        NumberUtils numberUtils = new NumberUtils();
        
        assertEquals(numbers(5), numberUtils.add(numbers(), numbers(5))); // 0 + 5 = 5
        assertEquals(numbers(5), numberUtils.add(numbers(5), numbers())); // 5 + 0 = 5
    }

    @Test
    void testAddWithNullLists() {
        NumberUtils numberUtils = new NumberUtils();
        
        assertNull(numberUtils.add(null, numbers(1, 2))); // Null input
        assertNull(numberUtils.add(numbers(1, 2), null)); // Null input
        assertNull(numberUtils.add(null, null)); // Null input
    }

    @Test
    void testAddWithInvalidDigits() {
        NumberUtils numberUtils = new NumberUtils();
        
        assertThrows(IllegalArgumentException.class, () -> numberUtils.add(numbers(1, 10), numbers(2))); // Invalid digit
        assertThrows(IllegalArgumentException.class, () -> numberUtils.add(numbers(1), numbers(11))); // Invalid digit
        assertThrows(IllegalArgumentException.class, () -> numberUtils.add(numbers(-1, 2), numbers(2))); // Invalid digit
    }
}


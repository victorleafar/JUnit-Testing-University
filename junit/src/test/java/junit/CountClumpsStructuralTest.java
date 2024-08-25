package junit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountClumpsStructuralTest {

    @Test
    public void testEmptyArray() {
        assertEquals(0, CountClumps.countClumps(new int[]{}), "Empty array should return 0");
    }

    @Test
    public void testArrayWithOneElement() {
        assertEquals(0, CountClumps.countClumps(new int[]{1}), "Array with one element should return 0");
    }

    @Test
    public void testArrayWithTwoDifferentElements() {
        assertEquals(0, CountClumps.countClumps(new int[]{1, 2}), "Array with two different elements should return 0");
    }

    @Test
    public void testArrayWithTwoSameElements() {
        assertEquals(1, CountClumps.countClumps(new int[]{1, 1}), "Array with two same elements should return 1");
    }

    @Test
    public void testArrayWithMultipleClumps() {
        assertEquals(2, CountClumps.countClumps(new int[]{1, 1, 2, 2, 2, 2, 2, 2}), "Array with multiple clumps should return 2");
    }

    @Test
    public void testArrayWithNoClumps() {
        assertEquals(0, CountClumps.countClumps(new int[]{1, 2, 3, 4, 5}), "Array with no clumps should return 0");
    }

    @Test
    public void testArrayWithConsecutiveClumps() {
        assertEquals(3, CountClumps.countClumps(new int[]{1, 1, 2, 2, 2, 3, 3, 3, 3, 3}), "Array with consecutive clumps should return 3");
    }

    @Test
    public void testArrayWithSingleClump() {
        assertEquals(1, CountClumps.countClumps(new int[]{1, 1, 1, 1, 1, 1, 1}), "Array with single clump should return 1");
    }

    @Test
    public void testArrayWithClumpsAtEnds() {
        assertEquals(2, CountClumps.countClumps(new int[]{1, 1, 1, 1, 2, 2, 2, 2}), "Array with clumps at the ends should return 2");
    }
}

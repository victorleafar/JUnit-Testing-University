package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountClumpsSpecificationTest {

    @Test
    public void testNullArray() {
        assertEquals(0, CountClumps.countClumps(null), "Null array should return 0");
    }

    @Test
    public void testArrayWithSingleElement() {
        assertEquals(0, CountClumps.countClumps(new int[]{1}), "Array with single element should return 0");
    }

    @Test
    public void testArrayWithNoClumps() {
        assertEquals(0, CountClumps.countClumps(new int[]{1, 2, 3, 4}), "Array with no clumps should return 0");
    }

    @Test
    public void testArrayWithOneClump() {
        assertEquals(1, CountClumps.countClumps(new int[]{1, 1, 1, 1, 1, 1}), "Array with one clump should return 1");
    }

    @Test
    public void testArrayWithMultipleClumps() {
        assertEquals(2, CountClumps.countClumps(new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2}), "Array with multiple clumps should return 2");
    }

    @Test
    public void testArrayWithClumpsAtEdges() {
        assertEquals(2, CountClumps.countClumps(new int[]{1, 1, 1, 1, 2, 2, 2, 2}), "Array with clumps at the edges should return 2");
    }

    @Test
    public void testArrayWithAllSameElements() {
        assertEquals(1, CountClumps.countClumps(new int[]{1, 1, 1, 1, 1}), "Array with all same elements should return 1");
    }

    @Test
    public void testArrayWithOnlyOneClumpButInDifferentPositions() {
        assertEquals(1, CountClumps.countClumps(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}), "Array with only one clump in different positions should return 1");
    }

    @Test
    public void testArrayWithNoValidClumps() {
        assertEquals(0, CountClumps.countClumps(new int[]{}), "Array with no valid clumps should return 0");
    }
}


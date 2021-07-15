package dynamic_programming.lesson_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridTravelerMemoizationTest {

    private final GridTravelerMemoization gridTravelerMemoization = new GridTravelerMemoization();


    @Test
    public void testNaive() {
        assertEquals(1, gridTravelerMemoization.naiveGridTraveler(1, 1));
        assertEquals(2, gridTravelerMemoization.naiveGridTraveler(2, 2));
        assertEquals(3, gridTravelerMemoization.naiveGridTraveler(2, 3));
        assertEquals(3, gridTravelerMemoization.naiveGridTraveler(3, 2));
//        assertEquals(2333606220L, gridTravelerMemoization.naiveGridTraveler(18, 18)); //will never complete
    }

    @Test
    public void testMemoization() {
        assertEquals(1, gridTravelerMemoization.gridTravelerMemoization(1, 1, null));
        assertEquals(2, gridTravelerMemoization.gridTravelerMemoization(2, 2, null));
        assertEquals(3, gridTravelerMemoization.gridTravelerMemoization(2, 3, null));
        assertEquals(3, gridTravelerMemoization.gridTravelerMemoization(3, 2, null));
        assertEquals(2333606220L, gridTravelerMemoization.gridTravelerMemoization(18, 18, null));
    }
}

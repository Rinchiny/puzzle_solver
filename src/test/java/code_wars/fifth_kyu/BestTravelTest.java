package code_wars.fifth_kyu;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BestTravelTest {

    @Test
    public void test() {
        var ts = Arrays.asList(50, 55, 56, 57, 58);
        assertEquals(163, BestTravel.chooseBestSum(163, 3, ts));
    }

    @Test
    public void test2() {
        var ts = Arrays.asList(50);
        assertNull(BestTravel.chooseBestSum(163, 3, ts));
    }

    @Test
    public void test3() {
        var ts = Arrays.asList(91, 74, 73, 85, 73, 81, 87);
        assertEquals(228, BestTravel.chooseBestSum(230, 3, ts));
    }

}

package code_wars.seventh_kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheDivisorsTest {

    private final CountTheDivisors countTheDivisors = new CountTheDivisors();

    @Test
    public void oneTest() {
        assertEquals(1, countTheDivisors.countNumberOfDivisors(1));
    }

    @Test
    public void fourTest() {
        assertEquals(3, countTheDivisors.countNumberOfDivisors(4));
    }

    @Test
    public void fiveTest() {
        assertEquals(2, countTheDivisors.countNumberOfDivisors(5));
    }

    @Test
    public void twelveTest() {
        assertEquals(6, countTheDivisors.countNumberOfDivisors(12));
    }

    @Test
    public void thirtyTest() {
        assertEquals(8, countTheDivisors.countNumberOfDivisors(30));
    }
}

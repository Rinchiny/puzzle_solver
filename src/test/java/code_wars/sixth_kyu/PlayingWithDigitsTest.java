package code_wars.sixth_kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayingWithDigitsTest {

    private final PlayingWithDigits pwd = new PlayingWithDigits();

    @Test
    public void test1() {
        assertEquals(1, pwd.digPow(89, 1));
    }
    @Test
    public void test2() {
        assertEquals(-1, pwd.digPow(92, 1));
    }
    @Test
    public void test3() {
        assertEquals(51, pwd.digPow(46288, 3));
    }

}

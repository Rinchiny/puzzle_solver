package code_wars.sixth_kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalRootTest {

    private final DigitalRoot dg = new DigitalRoot();

    @Test
    public void Test1() {
        assertEquals(7, dg.digitalRoot(16));
    }
    @Test
    public void Test2() {
        assertEquals(6, dg.digitalRoot(456));
    }
}

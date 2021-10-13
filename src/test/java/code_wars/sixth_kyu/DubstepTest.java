package code_wars.sixth_kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DubstepTest {

    private final Dubstep dubstep = new Dubstep();

    @Test
    public void test1() {
        assertEquals("ABC", dubstep.songDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void test2() {
        assertEquals("R L", dubstep.songDecoder("RWUBWUBWUBLWUB"));
    }
}

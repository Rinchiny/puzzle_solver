package code_wars.fourth_kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsMixTest {

    private final StringsMix stringsMix = new StringsMix();

    @Test
    public void test() {
        assertEquals("2:eeeee/2:yy/=:hh/=:rr",
                stringsMix.mix("Are they here", "yes, they are here"));
        assertEquals("1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg",
                stringsMix.mix("looping is fun but dangerous", "less dangerous than coding"));
        assertEquals("1:aaa/1:nnn/1:gg/2:ee/2:ff/2:ii/2:oo/2:rr/2:ss/2:tt",
                stringsMix.mix(" In many languages", " there's a pair of functions"));
        assertEquals("1:ee/1:ll/1:oo",
                stringsMix.mix("Lords of the Fallen", "gamekult"));
        assertEquals("",
                stringsMix.mix("codewars", "codewars"));
        assertEquals("1:nnnnn/1:ooooo/1:tttt/1:eee/1:gg/1:ii/1:mm/=:rr",
                stringsMix.mix("A generation must confront the looming ", "codewarrs"));
    }
}

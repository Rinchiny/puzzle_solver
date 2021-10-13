package code_wars.sixth_kyu;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastSurvivorTest {

    private final LastSurvivor ls = new LastSurvivor();


    @Test
    @Order(1)
    void ordinary() {
        assertEquals("ac", sort(ls.findLastSurvivor("abaa")), String.format("given: %s", "abaa"));
        assertEquals("c", sort(ls.findLastSurvivor("zzab")), String.format("given: %s", "zzab"));
        assertEquals("", sort(ls.findLastSurvivor("")), String.format("given: %s", ""));
    }

    @Test
    @Order(2)
    void zeroLength() {
        assertEquals("", sort(ls.findLastSurvivor("")), String.format("given: %s", ""));
    }

    @Test
    @Order(3)
    void newEdge() {
        String str ="xsdlafqpcmjytoikojsecamgdkehrqqgfknlhoudqygkbxftivfbpxhxtqgpkvsrfflpgrlhkbfnyftwkdebwfidmpauoteahyh";
        assertEquals("acdeghlmnqrvyz", sort(ls.findLastSurvivor(str)), String.format("given: %s", str));
    }

    private String sort(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

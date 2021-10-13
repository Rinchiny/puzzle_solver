package code_wars.sixth_kyu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheSmileyFacesTest {

    private final CountTheSmileyFaces countTheSmileyFaces = new CountTheSmileyFaces();

    @Test
    public void test1() {
        List<String> a = new ArrayList<>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, countTheSmileyFaces.countSmileys(a));
    }

    @Test
    public void test2() {
        List<String> a = new ArrayList<>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, countTheSmileyFaces.countSmileys(a));
    }

    @Test
    public void test4() {
        List<String> a =  new ArrayList<>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, countTheSmileyFaces.countSmileys(a));
    }

    @Test
    public void test5() {
        List<String> a =  new ArrayList<>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, countTheSmileyFaces.countSmileys(a));
    }
}

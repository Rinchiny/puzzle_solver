package code_wars.fourth_kyu.path_finder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Finder2Test {

    @Test
    public void sampleTests() {

        String a = ".W.\n"+
                         ".W.\n"+
                          "...",

                b =   ".W.\n"+
                        ".W.\n"+
                        "W..",

                c =   "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        "......",

                d =   "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        ".....W\n"+
                        "....W.";

        assertEquals(4,  Finder2.pathFinder(a));
        assertEquals(-1, Finder2.pathFinder(b));
        assertEquals(10,  Finder2.pathFinder(c));
        assertEquals(-1, Finder2.pathFinder(d));
    }
}

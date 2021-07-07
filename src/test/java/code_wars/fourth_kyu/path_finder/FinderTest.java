package code_wars.fourth_kyu.path_finder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FinderTest {

    @Test
    public void sampleTests() {

        String a = ".W.\n"+
                ".W.\n"+
                "...",

                b = ".W.\n"+
                        ".W.\n"+
                        "W..",

                c = "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        "......",

                d = "......\n"+
                        "......\n"+
                        "......\n"+
                        "......\n"+
                        ".....W\n"+
                        "....W.";

        assertTrue(Finder.pathFinder(a));
        assertFalse(Finder.pathFinder(b));
        assertTrue(Finder.pathFinder(c));
        assertFalse(Finder.pathFinder(d));
    }
}

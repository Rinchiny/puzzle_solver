package leet_code.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LRUCacheTest {

    @Test
    public void test1() {
        var testSubject = new LRUCache(2);
        testSubject.put(1, 1);
        testSubject.put(2, 2);
        Assertions.assertEquals(1, testSubject.get(1));
        testSubject.put(3, 3);
        Assertions.assertEquals(-1, testSubject.get(2), "Here");
        testSubject.put(4, 4);
        Assertions.assertEquals(-1, testSubject.get(1), "Or here");
        Assertions.assertEquals(3, testSubject.get(3));
        Assertions.assertEquals(4, testSubject.get(4));
    }

    @Test
    public void test2() {
        var testSubject = new LRUCache(2);
        Assertions.assertEquals(-1, testSubject.get(2));
        testSubject.put(2, 6);
        Assertions.assertEquals(-1, testSubject.get(1));
        testSubject.put(1, 5);
        testSubject.put(1, 2);
        Assertions.assertEquals(2, testSubject.get(1));
        Assertions.assertEquals(6, testSubject.get(2));
    }

    @Test
    public void test3() {
        var testSubject = new LRUCache(2);
        testSubject.put(2, 1);
        testSubject.put(1, 1);
        testSubject.put(2, 3);
        testSubject.put(4, 1);
        Assertions.assertEquals(-1, testSubject.get(1));
        Assertions.assertEquals(3, testSubject.get(2));
    }

    @Test
    public void test4() {
        var testSubject = new LRUCache(2);
        testSubject.put(2, 1);
        testSubject.put(2, 2);
        Assertions.assertEquals(2, testSubject.get(2));
        testSubject.put(1, 1);
        testSubject.put(4, 1);
        Assertions.assertEquals(-1, testSubject.get(2));
    }


    @Test
    public void test5() {
        var testSubject = new LRUCache(10);
        testSubject.put(10, 13);
        testSubject.put(3, 17);
        testSubject.put(6, 11);
        testSubject.put(10, 5);
        testSubject.put(9, 10);
        Assertions.assertEquals(-1, testSubject.get(13));
        testSubject.put(1, 1);
        testSubject.put(4, 1);
        Assertions.assertEquals(-1, testSubject.get(2));
    }
}

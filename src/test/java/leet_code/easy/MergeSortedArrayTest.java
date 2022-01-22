package leet_code.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    private final MergeSortedArray testSubject = new MergeSortedArray();

    @Test
    public void test() {
        assertArrayEquals(new int[]{1,2,2,3,5,6},
                testSubject.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3));
        assertArrayEquals(
                new int[]{1},
                testSubject.merge(new int[]{1}, 1, new int[]{}, 0));
        assertArrayEquals(
                new int[]{1},
                testSubject.merge(new int[]{0}, 0, new int[]{1}, 1));
    }

}

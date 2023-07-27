package leet_code.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumIISortedArrayTest {

    private final TwoSumIISortedArray testSubject = new TwoSumIISortedArray();

    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 2}, testSubject.twoSumViaBinarySearch(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{1, 2}, testSubject.twoSumViaBinarySearch(new int[]{0,0,3,4}, 0));
        assertArrayEquals(new int[]{1, 2}, testSubject.twoSumViaBinarySearch(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2}, testSubject.twoSumViaTwoPointers(new int[]{2,7,11,15}, 9));
        assertArrayEquals(new int[]{1, 2}, testSubject.twoSumViaTwoPointers(new int[]{0,0,3,4}, 0));
        assertArrayEquals(new int[]{1, 2}, testSubject.twoSumViaTwoPointers(new int[]{2,7,11,15}, 9));
    }
}

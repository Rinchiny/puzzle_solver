package leet_code.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray testSubject = new RemoveDuplicatesFromSortedArray();

    @Test
    void test() {
        assertEquals(3, testSubject.removeDuplicates(new int[]{0, 1, 1, 2}));
        assertEquals(2, testSubject.removeDuplicates(new int[]{1, 1, 2}));
    }

}

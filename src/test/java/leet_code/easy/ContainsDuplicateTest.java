package leet_code.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    private final ContainsDuplicate testSubject = new ContainsDuplicate();

    @Test
    public void test() {
        assertTrue(testSubject.containsDuplicate1(new int[]{1, 2, 3, 1}));
        assertTrue(testSubject.containsDuplicate2(new int[]{1, 2, 3, 1}));
        assertFalse(testSubject.containsDuplicate1(new int[]{1, 2, 3}));
        assertFalse(testSubject.containsDuplicate2(new int[]{1, 2, 3}));
    }
}

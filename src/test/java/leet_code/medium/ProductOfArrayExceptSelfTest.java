package leet_code.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf testSubject = new ProductOfArrayExceptSelf();

    @Test
    public void test() {
        assertArrayEquals(
            new int[]{24,12,8,6},
            testSubject.productExceptSelf(new int[]{1,2,3,4}));
    }

    @Test
    public void test2() {
        assertArrayEquals(
            new int[]{0,0,9,0,0},
            testSubject.productExceptSelf(new int[]{-1,1,0,-3,3}));
    }
}

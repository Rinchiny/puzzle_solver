package leet_code.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf testSubject = new ProductOfArrayExceptSelf();

    @Test
    public void test() {
        assertArrayEquals(new int[]{24,12,8,6}, testSubject.productExceptSelf(new int[]{1,2,3,4}));
    }
}

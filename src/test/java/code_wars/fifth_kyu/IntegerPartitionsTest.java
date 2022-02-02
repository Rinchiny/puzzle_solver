package code_wars.fifth_kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerPartitionsTest {

    private final IntegerPartitions testSubject = new IntegerPartitions();

    @Test
    public void test() {
        assertEquals("Range: 1 Average: 1.50 Median: 1.50", testSubject.part(2));
        assertEquals("Range: 2 Average: 2.00 Median: 2.00", testSubject.part(3));
        assertEquals("Range: 3 Average: 2.50 Median: 2.50", testSubject.part(4));
        assertEquals("Range: 5 Average: 3.50 Median: 3.50", testSubject.part(5));
    }
}

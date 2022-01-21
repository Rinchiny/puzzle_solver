package assessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetExcelIndexByLiteralTest {

    private final GetExcelIndexByLiteral testSubject = new GetExcelIndexByLiteral();

    @Test
    void getIndexByLiteral() {
        assertEquals(1, testSubject.getIndexByLiteral("A"));
        assertEquals(27, testSubject.getIndexByLiteral("AA"));
        assertEquals(28, testSubject.getIndexByLiteral("AB"));
        assertEquals(53, testSubject.getIndexByLiteral("BA"));
        assertEquals(702, testSubject.getIndexByLiteral("ZZ"));
    }

    @Test
    void getIndexByLiteral2() {
        assertEquals(703, testSubject.getIndexByLiteral("AAA"));
    }

    @Test
    void getIndexByLiteral3() {
        assertEquals(1, testSubject.getIndexByLiteral2("A"));
        assertEquals(27, testSubject.getIndexByLiteral2("AA"));
        assertEquals(28, testSubject.getIndexByLiteral2("AB"));
        assertEquals(53, testSubject.getIndexByLiteral2("BA"));
        assertEquals(702, testSubject.getIndexByLiteral2("ZZ"));
    }

    @Test
    void getIndexByLiteral4() {
        assertEquals(703, testSubject.getIndexByLiteral2("AAA"));
    }
}

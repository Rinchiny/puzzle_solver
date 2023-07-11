package leet_code.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class GenerateParenthesesTest {

    private final GenerateParentheses testSubject = new GenerateParentheses();

    @Test
    public void test() {
        assertEquals(List.of("((()))","(()())","(())()","()(())","()()()"), testSubject.generateParenthesis(3));
    }
}

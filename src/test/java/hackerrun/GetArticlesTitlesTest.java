package hackerrun;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetArticlesTitlesTest {

    private final GetArticlesTitles testSubject = new GetArticlesTitles();

    @Test
    void test() {
        assertEquals(List.of("A Message to Our Customers", "“Was isolated from 1999 to 2006 with a 486. Built my own late 80s OS”", "Apple’s declining software quality"), testSubject.getArticleTitlesWithPagination("epaga"));
    }
}

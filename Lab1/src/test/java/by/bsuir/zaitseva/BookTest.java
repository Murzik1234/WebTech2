package by.bsuir.zaitseva;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testClone() {

        Book originalBook = new Book("Title", "Author", 20, "ISBN123");

        try {

            Book clonedBook = (Book) originalBook.clone();
            assertNotSame(originalBook, clonedBook);

            assertEquals(originalBook.getTitle(), clonedBook.getTitle());
            assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
            assertEquals(originalBook.getPrice(), clonedBook.getPrice());
            assertEquals(originalBook.getEdition(), clonedBook.getEdition());
            assertEquals(originalBook.getIsbn(), clonedBook.getIsbn());

        } catch (CloneNotSupportedException e) {
            fail("CloneNotSupportedException should not be thrown.");
        }
    }

    @Test
    public void testCompareToSameIsbn() {
        Book book1 = new Book("Title1", "Author1", 20, "ISBN123");
        Book book2 = new Book("Title2", "Author2", 25, "ISBN123");

        int result = book1.compareTo(book2);

        assertEquals(0, result, "Books with the same ISBN should be considered equal.");
    }

    @Test
    public void testCompareToLessThan() {
        Book book1 = new Book("Title1", "Author1", 20, "ISBN123");
        Book book2 = new Book("Title2", "Author2", 25, "ISBN456");

        int result = book1.compareTo(book2);

        assertTrue(result < 0, "Book1 should be considered less than Book2.");
    }

    @Test
    public void testCompareToGreaterThan() {
        Book book1 = new Book("Title1", "Author1", 20, "ISBN789");
        Book book2 = new Book("Title2", "Author2", 25, "ISBN456");

        int result = book1.compareTo(book2);

        assertTrue(result > 0, "Book1 should be considered greater than Book2.");
    }
}

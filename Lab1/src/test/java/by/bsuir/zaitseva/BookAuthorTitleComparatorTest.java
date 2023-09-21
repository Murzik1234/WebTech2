package by.bsuir.zaitseva;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class BookAuthorTitleComparatorTest {

    @Test
    public void testCompare_SameAuthorAndTitle() {
        Book book1 = new Book("Title", "Author", 20, "ISBN123");
        Book book2 = new Book("Title", "Author", 25, "ISBN456");

        Comparator<Book> comparator = new BookAuthorTitleComparator();
        int result = comparator.compare(book1, book2);

        assertEquals(0, result, "Books with the same author and title should be considered equal.");
    }

    @Test
    public void testCompare_SameAuthor_DifferentTitle() {
        Book book1 = new Book("Title1", "Author", 20, "ISBN123");
        Book book2 = new Book("Title2", "Author", 25, "ISBN456");

        Comparator<Book> comparator = new BookAuthorTitleComparator();
        int result = comparator.compare(book1, book2);

        assertTrue(result < 0, "Book1 should be considered less than Book2.");
    }

    @Test
    public void testCompare_DifferentAuthor() {
        Book book1 = new Book("Title1", "Author1", 20, "ISBN123");
        Book book2 = new Book("Title2", "Author2", 25, "ISBN456");

        Comparator<Book> comparator = new BookAuthorTitleComparator();
        int result = comparator.compare(book1, book2);

        assertTrue(result < 0, "Book1 should be considered less than Book2.");
    }

    @Test
    public void testSortingWithComparator() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("B", "A", 20, "ISBN1"));
        books.add(new Book("A", "B", 30, "ISBN2"));
        books.add(new Book("C", "C", 25, "ISBN3"));

        Collections.sort(books, new BookAuthorTitleComparator());

        assertEquals("B", books.get(0).getTitle());
        assertEquals("A", books.get(1).getTitle());
        assertEquals("C", books.get(2).getTitle());
    }
}
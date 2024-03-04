import org.junit.Test;
import static org.junit.Assert.*;


public class BookTest {
	@Test
    public void testBookConstructor() {
        // Test seller constructor and getter methods
        Book book = new Book("01", "Harry Potter",100,"Fantasy world story","011100","JK Rowling","Fantasy",300);
        assertEquals("011100", book.getIsbn());
        assertEquals("JK Rowling", book.getAuthor());
        assertEquals("Fantasy", book.getGenre());
        assertEquals(300, book.getPageCount());
  
    }
}
